package org.deskconn.roomdatabase.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/deskconn/roomdatabase/data/UserViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "readAllData", "Landroidx/lifecycle/LiveData;", "", "Lorg/deskconn/roomdatabase/User;", "getReadAllData", "()Landroidx/lifecycle/LiveData;", "repository", "Lorg/deskconn/roomdatabase/data/UserRepository;", "addUser", "", "user", "deleteAllUsers", "deleteUser", "updateUser", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<org.deskconn.roomdatabase.User>> readAllData = null;
    private final org.deskconn.roomdatabase.data.UserRepository repository = null;
    
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.deskconn.roomdatabase.User>> getReadAllData() {
        return null;
    }
    
    public final void addUser(@org.jetbrains.annotations.NotNull()
    org.deskconn.roomdatabase.User user) {
    }
    
    public final void updateUser(@org.jetbrains.annotations.NotNull()
    org.deskconn.roomdatabase.User user) {
    }
    
    public final void deleteUser(@org.jetbrains.annotations.NotNull()
    org.deskconn.roomdatabase.User user) {
    }
    
    public final void deleteAllUsers() {
    }
}