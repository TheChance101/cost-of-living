package interactor

import model.CityEntity

class FindCitiesWithBestValueForMoneyInteractor(private val dataSource: CostOfLivingDataSource) {

    fun execute(limit: Int): List<CityEntity>? {
        return if (dataSource.getAllCitiesData().isEmpty()) {
            null
        } else {
            dataSource.getAllCitiesData().asSequence().filter(::excludeNullValues)
                .map { cityEntity -> Pair(cityEntity, calculateValueForMoney(cityEntity)) }.sortedBy { it.second }
                .distinct().take(limit).map { it.first }.toList()
        }
    }


    private fun excludeNullValues(city: CityEntity): Boolean {
        return (city.dataQuality) && (city.averageMonthlyNetSalaryAfterTax != null) && (city.mealsPrices.mealInexpensiveRestaurant != null) && (city.drinksPrices.waterOneAndHalfLiterBottleAtTheMarket != null) && (city.foodPrices.eggsRegular12 != null) && (city.fruitAndVegetablesPrices.tomato1kg != null) && (city.servicesPrices.tennisCourtRentOneHourOnWeekend != null) && (city.servicesPrices.fitnessClubMonthlyFeeForOneAdult != null) && (city.servicesPrices.cinemaInternationalReleaseOneSeat != null) && (city.transportationsPrices.taxi1kmNormalTariff != null) && (city.transportationsPrices.monthlyPassRegularPrice != null) && (city.transportationsPrices.oneWayTicketLocalTransport != null) && (city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null) && (city.realEstatesPrices.apartmentOneBedroomInCityCentre != null) && (city.clothesPrices.onePairOfJeansLevis50oneOrSimilar != null) && (city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null)
    }

    private fun calculateValueForMoney(city: CityEntity): Float {
        val basicGoodsAndServicesCost = calculateBasicGoodsAndServicesCost(city)
        val housingCost = calculateHousingCost(city)
        val transportationCost = calculateTransportationCost(city)
        val entertainmentCost = calculateEntertainmentCost(city)
        val totalCost = basicGoodsAndServicesCost + housingCost + transportationCost + entertainmentCost
        return city.averageMonthlyNetSalaryAfterTax?.div(totalCost) ?: Float.MIN_VALUE
    }

    private fun calculateBasicGoodsAndServicesCost(city: CityEntity): Float {
        val mealsCost = city.mealsPrices.mealInexpensiveRestaurant ?: 0f
        val drinksCost = city.drinksPrices.waterOneAndHalfLiterBottleAtTheMarket ?: 0f
        val fruitsAndVegetablesCost = city.fruitAndVegetablesPrices.tomato1kg ?: 0f
        val foodCost = city.foodPrices.eggsRegular12 ?: 0f
        val servicesCost = city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl ?: 0f
        val clothesCost = city.clothesPrices.onePairOfJeansLevis50oneOrSimilar ?: 0f
        return mealsCost + drinksCost + fruitsAndVegetablesCost + foodCost + servicesCost + clothesCost
    }

    private fun calculateHousingCost(city: CityEntity): Float {
        val apartmentInCityCentreCost = city.realEstatesPrices.apartmentOneBedroomInCityCentre ?: 0f
        val apartmentOutsideOfCentreCost = city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre ?: 0f
        return (apartmentInCityCentreCost + apartmentOutsideOfCentreCost) / 2
    }

    private fun calculateTransportationCost(city: CityEntity): Float {
        val localTransportCost = city.transportationsPrices.oneWayTicketLocalTransport ?: 0f
        val monthlyPassCost = city.transportationsPrices.monthlyPassRegularPrice ?: 0f
        val taxiCost = city.transportationsPrices.taxi1kmNormalTariff ?: 0f
        return (localTransportCost * 2) + monthlyPassCost + (taxiCost * 10)
    }

    private fun calculateEntertainmentCost(city: CityEntity): Float {
        val cinemaCost = city.servicesPrices.cinemaInternationalReleaseOneSeat ?: 0f
        val fitnessClubCost = city.servicesPrices.fitnessClubMonthlyFeeForOneAdult ?: 0f
        val tennisCourtCost = city.servicesPrices.tennisCourtRentOneHourOnWeekend ?: 0f
        return cinemaCost + fitnessClubCost + tennisCourtCost
    }


}
