package com.example.kotlintest.Kotlin

import android.os.Parcel
import android.os.Parcelable

class TestClass (var Tesxt1: String, var Tesxt2: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(Tesxt1)
        parcel.writeString(Tesxt2)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TestClass> {
        override fun createFromParcel(parcel: Parcel): TestClass {
            return TestClass(parcel)
        }

        override fun newArray(size: Int): Array<TestClass?> {
            return arrayOfNulls(size)
        }
    }
}