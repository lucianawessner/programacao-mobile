package br.com.luciana.receitamaluca

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val selectedIngredients = mutableListOf<String>()
    private lateinit var generateRecipeButton: Button
    private lateinit var ingredientsGrid: GridLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Certifique-se de que este arquivo existe

        generateRecipeButton = findViewById(R.id.generateRecipeButton)
        generateRecipeButton.setOnClickListener { generateRecipe() }

        ingredientsGrid = findViewById(R.id.ingredientsGrid)

        setupIngredients()
    }

    private fun setupIngredients() {
        val ingredients = listOf(
            R.string.ingredient1, R.string.ingredient2, R.string.ingredient3,
            R.string.ingredient4, R.string.ingredient5, R.string.ingredient6,
            R.string.ingredient7, R.string.ingredient8, R.string.ingredient9,
            R.string.ingredient10
        )

        val ingredientImages = listOf(
            R.drawable.ingredient1_image, R.drawable.ingredient2_image,
            R.drawable.ingredient3_image, R.drawable.ingredient4_image,
            R.drawable.ingredient5_image, R.drawable.ingredient6_image,
            R.drawable.ingredient7_image, R.drawable.ingredient8_image,
            R.drawable.ingredient9_image, R.drawable.ingredient10_image
        )

        ingredients.forEachIndexed { index, ingredientResId ->
            val checkbox = CheckBox(this).apply {
                text = getString(ingredientResId)
                setOnCheckedChangeListener { _, isChecked ->
                    if (isChecked) {
                        selectedIngredients.add(text.toString())
                    } else {
                        selectedIngredients.remove(text.toString())
                    }
                    updateGenerateButton()
                }
            }

            // Criação de um LinearLayout para cada ingrediente e sua imagem
            val layout = LinearLayout(this).apply {
                orientation = LinearLayout.HORIZONTAL
                addView(ImageView(this@MainActivity).apply {
                    setImageResource(ingredientImages[index])
                    layoutParams = LinearLayout.LayoutParams(100, 100) // Defina o tamanho da imagem
                })
                addView(checkbox)
            }

            ingredientsGrid.addView(layout)
        }
    }

    private fun updateGenerateButton() {
        generateRecipeButton.isEnabled = selectedIngredients.size == 3
    }

    private fun generateRecipe() {
        if (selectedIngredients.size == 3) { // Verifica se exatamente 3 ingredientes foram selecionados
            val intent = Intent(this, RecipeActivity::class.java).apply {
                putStringArrayListExtra("ingredients", ArrayList(selectedIngredients))
            }
            startActivity(intent)
        } else {
            Toast.makeText(this, "Selecione exatamente 3 ingredientes.", Toast.LENGTH_SHORT).show()
        }
    }
}