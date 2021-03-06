package somker.pro.com.mybluetooth.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import somker.pro.com.mybluetooth.entity.TeacherBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TEACHER_BEAN".
*/
public class TeacherBeanDao extends AbstractDao<TeacherBean, Long> {

    public static final String TABLENAME = "TEACHER_BEAN";

    /**
     * Properties of entity TeacherBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property LibId = new Property(1, String.class, "libId", false, "LIB_ID");
        public final static Property VersionCode = new Property(2, String.class, "versionCode", false, "VERSION_CODE");
        public final static Property TeaId = new Property(3, String.class, "teaId", false, "TEA_ID");
        public final static Property Name = new Property(4, String.class, "name", false, "NAME");
        public final static Property CardId = new Property(5, String.class, "cardId", false, "CARD_ID");
        public final static Property LoginAccount = new Property(6, String.class, "loginAccount", false, "LOGIN_ACCOUNT");
        public final static Property SignName = new Property(7, String.class, "signName", false, "SIGN_NAME");
        public final static Property SignPath = new Property(8, String.class, "signPath", false, "SIGN_PATH");
    }


    public TeacherBeanDao(DaoConfig config) {
        super(config);
    }
    
    public TeacherBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TEACHER_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"LIB_ID\" TEXT," + // 1: libId
                "\"VERSION_CODE\" TEXT," + // 2: versionCode
                "\"TEA_ID\" TEXT," + // 3: teaId
                "\"NAME\" TEXT," + // 4: name
                "\"CARD_ID\" TEXT," + // 5: cardId
                "\"LOGIN_ACCOUNT\" TEXT," + // 6: loginAccount
                "\"SIGN_NAME\" TEXT," + // 7: signName
                "\"SIGN_PATH\" TEXT);"); // 8: signPath
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TEACHER_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TeacherBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String libId = entity.getLibId();
        if (libId != null) {
            stmt.bindString(2, libId);
        }
 
        String versionCode = entity.getVersionCode();
        if (versionCode != null) {
            stmt.bindString(3, versionCode);
        }
 
        String teaId = entity.getTeaId();
        if (teaId != null) {
            stmt.bindString(4, teaId);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
 
        String cardId = entity.getCardId();
        if (cardId != null) {
            stmt.bindString(6, cardId);
        }
 
        String loginAccount = entity.getLoginAccount();
        if (loginAccount != null) {
            stmt.bindString(7, loginAccount);
        }
 
        String signName = entity.getSignName();
        if (signName != null) {
            stmt.bindString(8, signName);
        }
 
        String signPath = entity.getSignPath();
        if (signPath != null) {
            stmt.bindString(9, signPath);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TeacherBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String libId = entity.getLibId();
        if (libId != null) {
            stmt.bindString(2, libId);
        }
 
        String versionCode = entity.getVersionCode();
        if (versionCode != null) {
            stmt.bindString(3, versionCode);
        }
 
        String teaId = entity.getTeaId();
        if (teaId != null) {
            stmt.bindString(4, teaId);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
 
        String cardId = entity.getCardId();
        if (cardId != null) {
            stmt.bindString(6, cardId);
        }
 
        String loginAccount = entity.getLoginAccount();
        if (loginAccount != null) {
            stmt.bindString(7, loginAccount);
        }
 
        String signName = entity.getSignName();
        if (signName != null) {
            stmt.bindString(8, signName);
        }
 
        String signPath = entity.getSignPath();
        if (signPath != null) {
            stmt.bindString(9, signPath);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TeacherBean readEntity(Cursor cursor, int offset) {
        TeacherBean entity = new TeacherBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // libId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // versionCode
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // teaId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // name
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // cardId
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // loginAccount
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // signName
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // signPath
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TeacherBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLibId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setVersionCode(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTeaId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCardId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setLoginAccount(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSignName(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setSignPath(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TeacherBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TeacherBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TeacherBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
