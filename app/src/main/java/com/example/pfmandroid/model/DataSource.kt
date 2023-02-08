package com.example.pfmandroid.model

import com.example.pfmandroid.R

class DataSource {
    companion object {
        fun createDataSet() : ArrayList<Profile>{
            val list = ArrayList<Profile>()

            list.add(
                Profile(
                   "02/08/2022",
                    "Pagamento de Título",
                    "Gabrielle Alves Correia Rabelo",
                    "Inter",
                    "R$650,00",
                    "Pagamento",
                    R.drawable.intericon
                )

            )
            list.add(
                Profile(
                    "04/08/2022",
                    "Nidobox",
                    "Gabrielle Alves Correia Rabelo",
                    "Neon",
                    "R$900,32",
                    "Transferência",
                    R.drawable.nidoicon
                )

            )
            list.add(
                Profile(
                    "04/08/2022",
                    "Amazon(2/2)",
                    "Gabrielle Alves Correia Rabelo",
                    "Itaú",
                    "R$68,64",
                    "Pagamento",
                    R.drawable.amazoniccon
                )

            )
            list.add(
                Profile(
                    "06/08/2022",
                    "Pagamento de Título",
                    "Gabrielle Alves Correia Rabelo",
                    "Banco do Brasil",
                    "R$700,00",
                    "Pagamento",
                    R.drawable.bbicon
                )

            )
            list.add(
                Profile(
                    "07/08/2022",
                    "Pagamento de Fatura",
                    "Gabrielle Alves Correia Rabelo",
                    "Nubank",
                    "R$700,00",
                    "Pagamento",
                    R.drawable.nubankicon
                )

            )
            list.add(
                Profile(
                    "09/08/2022",
                    "Pagamento de Título",
                    "Gabrielle Alves Correia Rabelo",
                    "Banco Pa",
                    "R$700,00",
                    "Pagamento",
                    R.drawable.panicon
                )

            )
            return list
        }

    }

}