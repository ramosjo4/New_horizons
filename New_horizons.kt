
/*

Jose Ramos
9/28/17
"New Horizons"

The New
Horizons spacecraft, launched January 19th 2006,
is the first earth spacecraft to have
made contact with the planet Pluto.

This will calculate the distance that New Horizons is from the sun.
The user must input how many days after 09/01/17 they want the calculations to be done.
 */

fun main(args: Array<String>){

    //all variable declarations must be on separate lines

    println("Please enter the number of days after 09/01/2017")

    var daysAfter = readLine()!!.toDouble()
    //seconds is used to calculate the distance in miles and km
    var seconds = daysAfter * 86400
    var distanceMiles  = seconds * 8.85 + 39.33 * 92955800
    var distanceKm = seconds * 14.42 + 39.33 * 149598000
    var distanceAU = distanceMiles / 92955800
    var radioTime = distanceKm / 299792.458 * 2 /60 /60

    println("When it is : " + daysAfter + " days after 09/01/17. New Horizons will be :\n" + distanceAU + " AU away from the Sun.\n" +
    distanceMiles + " miles away from the Sun.\n" + distanceKm + " Km away from the Sun.\nIt also takes " + radioTime +
    " seconds for a radio wave to make a round trip from New Horizons to the Sun and back.\n" +
            "Thank you for using this program.")



}