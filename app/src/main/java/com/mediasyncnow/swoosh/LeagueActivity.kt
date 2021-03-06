package com.mediasyncnow.swoosh

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        nextBtn.setOnClickListener {
            val skillIntent = Intent(this, SkillActivity::class.java)
            startActivity(skillIntent)
        }
    }
}
