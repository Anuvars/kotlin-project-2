// GPSLocation.kt

import kotlin.random.Random

// Data class to hold latitude and longitude
data class GPSLocation(val latitude: Double, val longitude: Double)

class GPSReceiver {
    // Simulates getting the GPS coordinates
    fun getCurrentLocation(): GPSLocation {
        val latitude = Random.nextDouble(-90.0, 90.0)
        val longitude = Random.nextDouble(-180.0, 180.0)
        return GPSLocation(latitude, longitude)
    }
}

fun main() {
    val gpsReceiver = GPSReceiver()

    // Simulate fetching GPS location multiple times
    repeat(5) {
        val location = gpsReceiver.getCurrentLocation()
        println("Current GPS Location: Latitude: ${location.latitude}, Longitude: ${location.longitude}")
        Thread.sleep(1000) // Delay for 1 second to simulate time between readings
    }
}
