package com.utsman.kemana.impl

import com.mapbox.mapboxsdk.geometry.LatLng
import com.utsman.kemana.remote.place.Places

interface IMapView {
    fun mapStart(startLatLng: LatLng)
    fun mapReady(start: Places, destination: Places)
    fun mapOrder()
}