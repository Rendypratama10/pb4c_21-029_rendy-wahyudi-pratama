package org.deskconn.roomdatabase;

import java.lang.System;

@androidx.room.Entity(tableName = "user_Table")
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lorg/deskconn/roomdatabase/User;", "Landroid/os/Parcelable;", "id", "", "nama", "", "jenisKelamin", "telepon", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getJenisKelamin", "()Ljava/lang/String;", "getNama", "getTelepon", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class User implements android.os.Parcelable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nama = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String jenisKelamin = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String telepon = null;
    public static final android.os.Parcelable.Creator<org.deskconn.roomdatabase.User> CREATOR = null;
    
    public User(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String nama, @org.jetbrains.annotations.NotNull()
    java.lang.String jenisKelamin, @org.jetbrains.annotations.NotNull()
    java.lang.String telepon) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNama() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJenisKelamin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTelepon() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<org.deskconn.roomdatabase.User> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.deskconn.roomdatabase.User createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.deskconn.roomdatabase.User[] newArray(int size) {
            return null;
        }
    }
}