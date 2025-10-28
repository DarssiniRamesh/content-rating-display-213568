package org.example.app.data

import android.os.Parcel
import android.os.Parcelable

/**
 * PUBLIC_INTERFACE
 * RatingInfo is a simple Parcelable model used for the rating preview.
 */
data class RatingInfo(
    val title: String?,
    val ratingCode: String?,
    val ratingLabel: String?,
    val advisory: String?,
    val descriptors: List<String> = emptyList(),
    val requireCountdown: Boolean = false,
    val countdownSeconds: Int = 0
) : Parcelable {

    override fun describeContents(): Int = 0

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(title)
        dest.writeString(ratingCode)
        dest.writeString(ratingLabel)
        dest.writeString(advisory)
        dest.writeStringList(descriptors)
        dest.writeByte(if (requireCountdown) 1 else 0)
        dest.writeInt(countdownSeconds)
    }

    companion object CREATOR : Parcelable.Creator<RatingInfo> {
        override fun createFromParcel(parcel: Parcel): RatingInfo {
            val title = parcel.readString()
            val ratingCode = parcel.readString()
            val ratingLabel = parcel.readString()
            val advisory = parcel.readString()
            val descriptors = mutableListOf<String>().apply { parcel.readStringList(this) }.toList()
            val requireCountdown = parcel.readByte().toInt() != 0
            val countdownSeconds = parcel.readInt()
            return RatingInfo(title, ratingCode, ratingLabel, advisory, descriptors, requireCountdown, countdownSeconds)
        }
        override fun newArray(size: Int): Array<RatingInfo?> = arrayOfNulls(size)
    }
}
