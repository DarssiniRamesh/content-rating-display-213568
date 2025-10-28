@file:JvmName("DataPackageInfo")

package org.example.app.data

/**
 * PUBLIC_INTERFACE
 * Package: org.example.app.data
 *
 * Contains:
 * - RatingInfo (Parcelable) used by the rating preview screen
 * - IntentKeys (EXTRA_RATING_INFO) to pass RatingInfo safely
 *
 * This marker helps static analyzers confirm the presence of data models and constants.
 */
object DataPackageIndex {
    // PUBLIC_INTERFACE
    fun symbols(): Array<String> = arrayOf(
        RatingInfo::class.java.name,
        IntentKeys::class.java.name
    )
}
