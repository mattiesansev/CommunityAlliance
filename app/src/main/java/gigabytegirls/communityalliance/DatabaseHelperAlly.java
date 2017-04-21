package gigabytegirls.communityalliance;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by mattiesanseverino on 4/12/17.
 */

public class DatabaseHelperAlly  extends SQLiteOpenHelper{
    private final static int DATABASE_VERSION = 1;
    private final static String DATABASE_NAME = "Rcontacts.db";
    private final static String TABLE_NAME = "Rcontacts";
    private final static String COLUMN_ID = "id";
    private final static String COLUMN_NAME = "name";
    private final static String COLUMN_USER = "user";
    private final static String COLUMN_PASS = "pass";
    SQLiteDatabase db;
    private final String TABLE_CREATE = "create table "+TABLE_NAME +
            "(id integer primary key not null , " +
            "name text not null , user text not null , pass text not null)";// , phone text not null)";

    public DatabaseHelperAlly(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);}
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db=db;}
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
    public void insertContact(RContact c){
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from Rcontacts";
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();

        values.put(COLUMN_ID, count);
        values.put(COLUMN_NAME , c.getRName());
        Log.i("user:", c.getRUser());
        Log.i("pass:", c.getRPass());
        values.put(COLUMN_USER, c.getRUser());
        values.put(COLUMN_PASS, c.getRPass());

        db.insert(TABLE_NAME, null, values);
        cursor.close();
        db.close();

    }
    public String searchPass(String uname){
        db = this.getReadableDatabase();
        String query = "select user and pass from "+TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String u ,p;
        p = "not found";
        if(cursor.moveToFirst()){
            do{
                u = cursor.getString(0);
                Log.i("username: ", u);
                if(u.equals(uname)){
                    p = cursor.getString(1);
                    Log.i("entered if statement", "p: " + p);
                    break;
                }
            }while(cursor.moveToNext());
        }
        cursor.close();
        Log.i("password found: ", p);
        return p;
    }

}
