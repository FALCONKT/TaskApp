package jp.techacademy.kenji.takada.taskapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Ljp/techacademy/kenji/takada/taskapp/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "category", "", "getCategory", "()Ljava/lang/String;", "mOnCategoryClickListener", "Landroid/view/View$OnClickListener;", "mRealm", "Lio/realm/Realm;", "mRealmListener", "Lio/realm/RealmChangeListener;", "mTaskAdapter", "Ljp/techacademy/kenji/takada/taskapp/TaskAdapter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "reloadListView", "searchCategory", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private io.realm.Realm mRealm;
    private final io.realm.RealmChangeListener<io.realm.Realm> mRealmListener = null;
    private jp.techacademy.kenji.takada.taskapp.TaskAdapter mTaskAdapter;
    private final android.view.View.OnClickListener mOnCategoryClickListener = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String category = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void reloadListView() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCategory() {
        return null;
    }
    
    private final void searchCategory() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public MainActivity() {
        super();
    }
}