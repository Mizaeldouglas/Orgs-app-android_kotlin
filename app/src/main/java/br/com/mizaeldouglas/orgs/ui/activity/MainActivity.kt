package br.com.mizaeldouglas.orgs.ui.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.mizaeldouglas.orgs.R
import br.com.mizaeldouglas.orgs.model.Product
import br.com.mizaeldouglas.orgs.ui.recycleView.adapter.ListProductAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recycleView = findViewById<RecyclerView>(R.id.recycleView)
        recycleView.adapter = ListProductAdapter(
            contex = this, products = listOf(
                Product(
                    name = "Cesta de Chocolate",
                    description = "Diamante negro, Laka, Caixa de bombom, Kitkat",
                    price = BigDecimal("29.59")
                ),
                Product(
                    name = "Cesta de Fruta",
                    description = "Banana, Manga, Morango, Pera",
                    price = BigDecimal("15.99")
                ),

            )
        )


    }


}