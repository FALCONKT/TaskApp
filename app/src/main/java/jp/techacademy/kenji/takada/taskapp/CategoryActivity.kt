//package jp.techacademy.kenji.takada.taskapp
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import androidx.appcompat.widget.Toolbar
////■activity_mainのところにある検索Button感知用
//import kotlinx.android.synthetic.main.activity_main.*
//import io.realm.RealmQuery
////import androidx.core.app.ComponentActivity
//import androidx.core.app.ComponentActivity.ExtraData
////import android.icu.lang.UCharacter.GraphemeClusterBreak.T
//import androidx.core.content.ContextCompat.getSystemService
//import io.realm.RealmResults
//import android.icu.lang.UCharacter.GraphemeClusterBreak.T
//import android.util.Log
//import androidx.core.content.ContextCompat.getSystemService
//
//import io.realm.Realm
//import io.realm.Sort
//import kotlinx.android.synthetic.main.content_input.*
//
//
//class CategoryActivity : AppCompatActivity() {
//
//    //■　Realm取得
//    //■ Realm　import
//    private lateinit var mRealm: Realm
//    private lateinit var mTaskAdapter: TaskAdapter
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_categiory)
//
//        //■　Realm取得
//        //■ ListViewの設定
//        mTaskAdapter = TaskAdapter(this)
//
//
//        //■ Category 追加関連＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
//        //■ ActionBarを設定する
//        //■ Toolbar　View  import要
//        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
//        setSupportActionBar(toolbar)
//        if (supportActionBar != null) {
//            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//        }
//
//        // 検索Button　Listener
//        search_button.setOnClickListener(mOnCategoryClickListener)
//
//        Log.d("TaskApp", "setOnClickListener")
//
//
//    }
//
//    private val mOnCategoryClickListener = View.OnClickListener {
////        検索した際のMethod
//        searchCategory()
//    }
//
////    ■　
//    private fun searchCategory(){
//
//        //■　一回　Realmを設定
//        var queryAll = mRealm.where(Task::class.java)
//
//        //■  文字列に変換
//        val category = category_edit_text.text.toString()
//
//        //■　その文字列で検索して　一回指定したRealmDBから　ここで　検索
//        var querySearch = queryAll.equalTo("category",category)
//
//
//        //■Query条件を追加する
//        val categorySResult = querySearch.sort("date", Sort.DESCENDING).findAll()
//
//
//        // 上記の結果を、TaskListとしてセットする
//        mTaskAdapter.mTaskList = mRealm.copyFromRealm(categorySResult)
//
//        // TaskのListView用のアダプタに渡す
//        listView1.adapter = mTaskAdapter
//
//        // 表示を更新するために、アダプターにデータが変更されたことを知らせる
//        mTaskAdapter.notifyDataSetChanged()
//    }
//
//    //■　Realmを閉じる
//    override fun onDestroy() {
//        super.onDestroy()
//
//        mRealm.close()
//    }
//
//}
////Class END