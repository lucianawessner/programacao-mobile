package br.com.luciana.receitamaluca

import android.content.Context
import kotlin.random.Random

object GerarReceitas {
    fun gerarReceita(
        context: Context,
        ingrediente1: String,
        ingrediente2: String,
        ingrediente3: String
    ): Pair<String, String> {
        val receitas = listOf(
            R.string.receita1,
            R.string.receita2,
            R.string.receita3,
            R.string.receita4,
            R.string.receita5,
            R.string.receita5,
            R.string.receita6,
            R.string.receita7,
            R.string.receita8,
            R.string.receita9,
            R.string.receita10,
            R.string.receita11,
            R.string.receita12,
            R.string.receita13,
            R.string.receita14,
            R.string.receita15,
            R.string.receita16,
            R.string.receita17,
            R.string.receita18,
            R.string.receita19,
            R.string.receita20,
            R.string.receita21,
            R.string.receita22,
            R.string.receita23,
            R.string.receita24,
            R.string.receita25,
            R.string.receita26,
            R.string.receita27,
            R.string.receita28,
            R.string.receita29,
            R.string.receita30,
            R.string.receita31,
            R.string.receita32,
            R.string.receita33,
            R.string.receita34,
            R.string.receita35,
            R.string.receita36,
            R.string.receita37,
            R.string.receita38,
            R.string.receita39,
            R.string.receita40,
            R.string.receita41,
            R.string.receita42,
            R.string.receita43,
            R.string.receita44,
            R.string.receita45

        )

        val receitaEscolhida = receitas[Random.nextInt(receitas.size)]
        val titulo = context.getString(receitaEscolhida)

        val textoReceita = when (receitaEscolhida) {
            R.string.receita1 -> context.getString(R.string.receita1_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita2 -> context.getString(R.string.receita2_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita3 -> context.getString(R.string.receita3_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita4 -> context.getString(R.string.receita4_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita5 -> context.getString(R.string.receita5_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita6 -> context.getString(R.string.receita6_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita7 -> context.getString(R.string.receita7_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita8 -> context.getString(R.string.receita8_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita9 -> context.getString(R.string.receita9_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita10 -> context.getString(R.string.receita10_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita11 -> context.getString(R.string.receita11_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita12 -> context.getString(R.string.receita12_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita13 -> context.getString(R.string.receita13_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita14 -> context.getString(R.string.receita14_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita15 -> context.getString(R.string.receita15_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita16 -> context.getString(R.string.receita16_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita17 -> context.getString(R.string.receita17_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita18 -> context.getString(R.string.receita18_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita19 -> context.getString(R.string.receita19_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita20 -> context.getString(R.string.receita20_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita21 -> context.getString(R.string.receita21_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita22 -> context.getString(R.string.receita22_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita23 -> context.getString(R.string.receita23_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita24 -> context.getString(R.string.receita24_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita25 -> context.getString(R.string.receita25_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita26 -> context.getString(R.string.receita26_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita27 -> context.getString(R.string.receita27_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita28 -> context.getString(R.string.receita28_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita29 -> context.getString(R.string.receita29_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita30 -> context.getString(R.string.receita30_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita31 -> context.getString(R.string.receita31_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita32 -> context.getString(R.string.receita32_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita33 -> context.getString(R.string.receita33_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita34 -> context.getString(R.string.receita34_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita35 -> context.getString(R.string.receita35_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita36 -> context.getString(R.string.receita36_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita37 -> context.getString(R.string.receita37_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita38 -> context.getString(R.string.receita38_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita39 -> context.getString(R.string.receita39_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita40 -> context.getString(R.string.receita40_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita41 -> context.getString(R.string.receita41_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita42 -> context.getString(R.string.receita42_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita43 -> context.getString(R.string.receita43_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita44 -> context.getString(R.string.receita44_text, ingrediente1, ingrediente2, ingrediente3)
            R.string.receita45 -> context.getString(R.string.receita45_text, ingrediente1, ingrediente2, ingrediente3)
            else -> "Receita desconhecida!"
        }

        return Pair(titulo, textoReceita)
    }
}