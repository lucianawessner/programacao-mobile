package br.com.luciana.receitamaluca

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class RecipeActivity : AppCompatActivity() {
    private lateinit var recipeTitleTextView: TextView
    private lateinit var ingredientsTextView: TextView
    private lateinit var recipeTextView: TextView
    private lateinit var shareRecipeButton: Button
    private lateinit var recipeImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        // Inicializando os elementos de UI
        recipeTitleTextView = findViewById(R.id.recipeTitleTextView)
        ingredientsTextView = findViewById(R.id.ingredientsTextView)
        recipeTextView = findViewById(R.id.recipeTextView)
        shareRecipeButton = findViewById(R.id.shareRecipeButton)
        recipeImageView = findViewById(R.id.recipeImageView)

        // Obtendo ingredientes da Intent
        val ingredients = intent.getStringArrayListExtra("ingredients") // Aqui você obtém a lista de ingredientes

        if (ingredients != null && ingredients.size >= 3) {
            val (recipeTitle, recipeText) = GerarReceitas.gerarReceita(
                this,
                ingredients[0],
                ingredients[1],
                ingredients[2]
            )
            recipeTitleTextView.text = recipeTitle
            ingredientsTextView.text = ingredients.joinToString(", ") // Exibe os ingredientes selecionados
            recipeTextView.text = recipeText

            // Selecionar uma imagem aleatória da receita
            val recipeImages = listOf(
                R.drawable.recipe1_image,
                R.drawable.recipe2_image,
                R.drawable.recipe3_image,
                R.drawable.recipe4_image,
                R.drawable.recipe5_image,
                R.drawable.recipe6_image,
                R.drawable.recipe7_image,
                R.drawable.recipe8_image,
                R.drawable.recipe9_image,
                R.drawable.recipe10_image,
                R.drawable.recipe11_image,
                R.drawable.recipe12_image,
                R.drawable.recipe13_image,
                R.drawable.recipe14_image,
                R.drawable.recipe15_image,
                R.drawable.recipe16_image,
                R.drawable.recipe17_image,
                R.drawable.recipe18_image,
                R.drawable.recipe19_image,

            )
            val randomImageResId = getRandomImage(recipeImages)
            recipeImageView.setImageResource(randomImageResId)

            shareRecipeButton.setOnClickListener { shareRecipe(recipeTitle, recipeText) }
        } else {
            recipeTitleTextView.text = getString(R.string.error)
            recipeTextView.text = getString(R.string.insufficient_ingredients)
        }
    }

    private fun getRandomImage(images: List<Int>): Int {
        val randomIndex = Random.nextInt(images.size)
        return images[randomIndex]
    }

    private fun shareRecipe(title: String, text: String) {
        val shareIntent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, title)
            putExtra(Intent.EXTRA_TEXT, text)
        }
        startActivity(Intent.createChooser(shareIntent, "Compartilhar Receita"))
    }
}