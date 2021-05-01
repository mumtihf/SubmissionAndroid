package com.mumti.submissionandroid

object SkincareData {
    private val skincareNames = arrayOf(
        "Benton Aloe BHA Skin Toner",
        "Everwhite Peptide Eye Cream",
        "Himalaya Neem Mask",
        "Innisfree Aloe Revital Soothing Gel",
        "Laneige Water Sleeping Mask",
        "Pyunkang Yul Essence Toner",
        "Simple Refreshing Facial Wash",
        "Skin Aqua UV Moisture Milk",
        "ST Ives Chamomile Cleanser",
        "Viva Milk Cleanser"
    )

    private val skincarePrices= arrayOf(
        "Rp 143.000",
        "Rp 97.000",
        "Rp 40.000",
        "Rp 100.000",
        "Rp 225.000",
        "Rp 129.000",
        "Rp 175.000",
        "Rp 57.000",
        "Rp 109.000",
        "Rp 10.000"
    )

    private val skincareImages = intArrayOf(
        R.drawable.benton_bha,
        R.drawable.everwhite_eyecream,
        R.drawable.himalaya,
        R.drawable.innisfree_aloe,
        R.drawable.laneige,
        R.drawable.pyunkang_yul,
        R.drawable.simple,
        R.drawable.skin_aqua,
        R.drawable.st_ives,
        R.drawable.viva
    )

    private val skincareLikes = arrayOf(
        "50 Likes",
        "20 Likes",
        "55 Likes",
        "70 Likes",
        "102 Likes",
        "100 Likes",
        "65 Likes",
        "72 Likes",
        "45 Likes",
        "13 Likes"
    )

    private val skincareDescription = arrayOf(
        "Benton Aloe BHA Skin Toner adalah toner wajah yang mengandung aloe dan salicylic acid yang mampu menghidrasi kulit dan mempersiapkan wajah untuk menggunakan perawatan kulit wajah selanjutnya. Produk ini mampu mengangkat semua kotoran dan jerawat menjadi kempes.",
        "Everwhite Peptide Eye Cream adalah krim mata yang dapat mengatasi permasalahan pada area kulit mata seperti melembabkan, merawat kehalusan kulit di sekitar mata, mampu mengatasi kantung mata, dan mengurangi lingkaran hitam.",
        "Himalaya Neem Mask adalah masker yang bisa membantu mengatur kelebihan minyak yang ada di dalam wajah, membersihkan pori-pori tersumbat serta mencegah timbulnya jerawat. Produk ini mengandung Neem sebagai key ingredients nya.",
        "Innisfree Aloe Revital Soothing Gel adalah gel multifungsi yang dapat memberikan kelembapan pada wajah serta dapat menenangkan kulit yang lelah karena mengandung aloe vera atau lidah buaya sebesar 93% yang berasal dari Pulau Jeju, Korea.",
        "Laneige Water Sleeping Mask adalah masker wajah yang dapat membuat kulit menjadi segar dan cerah keesokan harinya. Masker ini digunakan pada malam hari dan cocok untuk semua jenis kulit. ",
        "Pyunkang Yul Essence Toner adalah toner wajah yang dapat memberikan hidrasi pada wajah yang mengandung 91.3% Milk Vetch Root Extract. Toner wajah ini tidak mengandung wewangian sehingga aman untuk digunakan oleh kulit sensitif.",
        "Simple Refreshing Facial Wash adalah sabun cuci muka yang dapat mengangkat kotoran dan noda pada wajah sehingga kulit menjadi lebih bersih dan segar. Produk ini mengandung Triple Purified Water dan vitamin untuk membantu menutrisi kulit. Tidak mengandung pewarna dan pewangi.",
        "Skin Aqua UV Moisture Milk adalah sunscreen yang mengandung SPF 50+ PA+++ untuk melindungi kulit dari sinar UV-A & UV-B. Produk ini juga mengandung Hydraulic Acid dan Collagen yang melembabkan, melembutkan kulit, dan mempertahankan elastisitas kulit.",
        "ST Ives Chamomile Facial Cleanser adalah pembersih wajah yang lembut mampu menghilangkan debu, minyak & kotoran. Produk ini cruelty free artinya tidak menjadikan hewan sebagai tester, no fragrance, dan no paraben. Terbuat dari 100% Natural Chamomile Extract.",
        "Viva Milk Cleanser (Bengkuang) adalah susu pembersih wajah untuk kulit normal yang mengandung bahan alami Ekstrak Bengkuang agar kulit wajah tampak lebih cerah dan diperkaya dengan kandungan ekstrak biji bunga matahari untuk merawat elastisitas kulir w"
    )

    val listData: ArrayList<Skincare>
        get() {
            val list = arrayListOf<Skincare>()
            for (position in skincareNames.indices) {
                val skincare = Skincare()
                skincare.name = skincareNames[position]
                skincare.price = skincarePrices[position]
                skincare.photo = skincareImages[position]
                skincare.likes = skincareLikes[position]
                skincare.desc = skincareDescription[position]
                list.add(skincare)
            }
            return list
        }
}