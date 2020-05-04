package jp.mamori_i.app.extension

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.showAlert(message: String,
                                completion: (() -> Unit)? = null) {
    AlertDialog.Builder(this)
        .setMessage(message)
        .setPositiveButton("OK") { _, _ ->
            completion?.invoke()
        }
        .setCancelable(completion == null)
        .show()
}
