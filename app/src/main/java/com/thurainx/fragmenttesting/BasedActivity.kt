package com.thurainx.fragmenttesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.thurainx.fragmenttesting.based_fragements.FirstFragment
import com.thurainx.fragmenttesting.based_fragements.SecondFragment

class BasedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_based)

//        supportFragmentManager.beginTransaction()
//            .add(R.id.fragmentContainerFirst, FirstFragment())
//            .add(R.id.fragmentContainerSecond, SecondFragment())
//            .commit()

        supportFragmentManager.commit {
            add<FirstFragment>(R.id.fragmentContainerFirst)
            add<SecondFragment>(R.id.fragmentContainerSecond)
        }

    }
}