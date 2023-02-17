import interactor.CostOfLivingDataSource
import model.*

class FakeDataRentApartmentPrice:CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(

            CityEntity(
                cityName =" ", country ="Sri Lanka",
                mealsPrices = MealsPrices(mealInexpensiveRestaurant=1.36f, mealFor2PeopleMidRangeRestaurant=10.85f, mealAtMcDonaldSOrEquivalent=3.25f),
                drinksPrices = DrinksPrices(cappuccinoRegularInRestaurants=1.46f, cokePepsiAThirdOfLiterBottleInRestaurants=0.35f, waterAThirdOfLiterBottleInRestaurants=0.18f, milkRegularOneLiter=1.15f, waterOneAndHalfLiterBottleAtTheMarket=0.4f),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(apples1kg=4.27f, banana1kg=0.76f, oranges1kg=3.18f, tomato1kg=1.42f, potato1kg=1.02f, onion1kg=0.74f, lettuceOneHead=0.83f),
                foodPrices = FoodPrices(loafOfFreshWhiteBread500g=0.64f, riceWhite1kg=0.66f, eggsRegular12=1.77f, localCheese1kg=7.4f, chickenFillets1kg=4.03f, beefRound1kgOrEquivalentBackLegRedMeat=5.89f),
                servicesPrices = ServicesPrices(basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment=23.56f, oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans=0.01f, internet60MbpsOrMoreUnlimitedDataCableAdsl=9.61f, fitnessClubMonthlyFeeForOneAdult=9.43f, tennisCourtRentOneHourOnWeekend=3.73f, cinemaInternationalReleaseOneSeat=2.37f, preschoolOrKindergartenFullDayPrivateMonthlyForOneChild=26.55f, internationalPrimarySchoolYearlyForOneChild=425.77f),
                clothesPrices = ClothesPrices(onePairOfJeansLevis50oneOrSimilar=20.59f, oneSummerDressInAChainStoreZaraHAndM=12.77f, onePairOfNikeRunningShoesMidRange=44.42f, onePairOfMenLeatherBusinessShoes=24.71f),
                transportationsPrices = TransportationsPrices(oneWayTicketLocalTransport=0.11f, monthlyPassRegularPrice=4.07f, taxiStartNormalTariff=0.27f, taxi1kmNormalTariff=0.27f, taxi1hourWaitingNormalTariff=0.49f, gasolineOneLiter=1.17f),
                carsPrices = CarsPrices(volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar=24406.97f, toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar=28672.95f),
                realEstatesPrices = RealEstatesPrices(apartmentOneBedroomInCityCentre=20f, apartmentOneBedroomOutsideOfCentre=10f, apartment3BedroomsInCityCentre=30f, apartment3BedroomsOutsideOfCentre=20f, pricePerSquareMeterToBuyApartmentInCityCentre=1734.36f, pricePerSquareMeterToBuyApartmentOutsideOfCentre=430.56f),
                averageMonthlyNetSalaryAfterTax =3000.0f, dataQuality =true),

            CityEntity(
                cityName ="Lannull", country ="Sri Lanka",
                mealsPrices = MealsPrices(mealInexpensiveRestaurant=1.36f, mealFor2PeopleMidRangeRestaurant=10.85f, mealAtMcDonaldSOrEquivalent=3.25f),
                drinksPrices = DrinksPrices(cappuccinoRegularInRestaurants=1.46f, cokePepsiAThirdOfLiterBottleInRestaurants=0.35f, waterAThirdOfLiterBottleInRestaurants=0.18f, milkRegularOneLiter=1.15f, waterOneAndHalfLiterBottleAtTheMarket=0.4f),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(apples1kg=4.27f, banana1kg=0.76f, oranges1kg=3.18f, tomato1kg=1.42f, potato1kg=1.02f, onion1kg=0.74f, lettuceOneHead=0.83f),
                foodPrices = FoodPrices(loafOfFreshWhiteBread500g=0.64f, riceWhite1kg=0.66f, eggsRegular12=1.77f, localCheese1kg=7.4f, chickenFillets1kg=4.03f, beefRound1kgOrEquivalentBackLegRedMeat=5.89f),
                servicesPrices = ServicesPrices(basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment=23.56f, oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans=0.01f, internet60MbpsOrMoreUnlimitedDataCableAdsl=9.61f, fitnessClubMonthlyFeeForOneAdult=9.43f, tennisCourtRentOneHourOnWeekend=3.73f, cinemaInternationalReleaseOneSeat=2.37f, preschoolOrKindergartenFullDayPrivateMonthlyForOneChild=26.55f, internationalPrimarySchoolYearlyForOneChild=425.77f),
                clothesPrices = ClothesPrices(onePairOfJeansLevis50oneOrSimilar=20.59f, oneSummerDressInAChainStoreZaraHAndM=12.77f, onePairOfNikeRunningShoesMidRange=44.42f, onePairOfMenLeatherBusinessShoes=24.71f),
                transportationsPrices = TransportationsPrices(oneWayTicketLocalTransport=0.11f, monthlyPassRegularPrice=4.07f, taxiStartNormalTariff=0.27f, taxi1kmNormalTariff=0.27f, taxi1hourWaitingNormalTariff=0.49f, gasolineOneLiter=1.17f),
                carsPrices = CarsPrices(volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar=24406.97f, toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar=28672.95f),
                realEstatesPrices = RealEstatesPrices(apartmentOneBedroomInCityCentre=80f, apartmentOneBedroomOutsideOfCentre=40f, apartment3BedroomsInCityCentre=70f, apartment3BedroomsOutsideOfCentre=50f, pricePerSquareMeterToBuyApartmentInCityCentre=1734.36f, pricePerSquareMeterToBuyApartmentOutsideOfCentre=430.56f),
                averageMonthlyNetSalaryAfterTax =null, dataQuality =true),

            CityEntity(
                cityName ="Metanull", country ="Sri Lanka",
                mealsPrices = MealsPrices(mealInexpensiveRestaurant=1.36f, mealFor2PeopleMidRangeRestaurant=10.85f, mealAtMcDonaldSOrEquivalent=3.25f),
                drinksPrices = DrinksPrices(cappuccinoRegularInRestaurants=1.46f, cokePepsiAThirdOfLiterBottleInRestaurants=0.35f, waterAThirdOfLiterBottleInRestaurants=0.18f, milkRegularOneLiter=1.15f, waterOneAndHalfLiterBottleAtTheMarket=0.4f),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(apples1kg=4.27f, banana1kg=0.76f, oranges1kg=3.18f, tomato1kg=1.42f, potato1kg=1.02f, onion1kg=0.74f, lettuceOneHead=0.83f),
                foodPrices = FoodPrices(loafOfFreshWhiteBread500g=0.64f, riceWhite1kg=0.66f, eggsRegular12=1.77f, localCheese1kg=7.4f, chickenFillets1kg=4.03f, beefRound1kgOrEquivalentBackLegRedMeat=5.89f),
                servicesPrices = ServicesPrices(basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment=23.56f, oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans=0.01f, internet60MbpsOrMoreUnlimitedDataCableAdsl=9.61f, fitnessClubMonthlyFeeForOneAdult=9.43f, tennisCourtRentOneHourOnWeekend=3.73f, cinemaInternationalReleaseOneSeat=2.37f, preschoolOrKindergartenFullDayPrivateMonthlyForOneChild=26.55f, internationalPrimarySchoolYearlyForOneChild=425.77f),
                clothesPrices = ClothesPrices(onePairOfJeansLevis50oneOrSimilar=20.59f, oneSummerDressInAChainStoreZaraHAndM=12.77f, onePairOfNikeRunningShoesMidRange=44.42f, onePairOfMenLeatherBusinessShoes=24.71f),
                transportationsPrices = TransportationsPrices(oneWayTicketLocalTransport=0.11f, monthlyPassRegularPrice=4.07f, taxiStartNormalTariff=0.27f, taxi1kmNormalTariff=0.27f, taxi1hourWaitingNormalTariff=0.49f, gasolineOneLiter=1.17f),
                carsPrices = CarsPrices(volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar=24406.97f, toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar=28672.95f),
                realEstatesPrices = RealEstatesPrices(apartmentOneBedroomInCityCentre=90f, apartmentOneBedroomOutsideOfCentre=70f, apartment3BedroomsInCityCentre=110f, apartment3BedroomsOutsideOfCentre=90f, pricePerSquareMeterToBuyApartmentInCityCentre=1734.36f, pricePerSquareMeterToBuyApartmentOutsideOfCentre=null),
                averageMonthlyNetSalaryAfterTax =3000.0f, dataQuality =true),

            CityEntity(
                cityName ="Lanka", country ="Sri Lanka",
                mealsPrices =MealsPrices(mealInexpensiveRestaurant=1.36f, mealFor2PeopleMidRangeRestaurant=10.85f, mealAtMcDonaldSOrEquivalent=3.25f),
                drinksPrices =DrinksPrices(cappuccinoRegularInRestaurants=1.46f, cokePepsiAThirdOfLiterBottleInRestaurants=0.35f, waterAThirdOfLiterBottleInRestaurants=0.18f, milkRegularOneLiter=1.15f, waterOneAndHalfLiterBottleAtTheMarket=0.4f),
                fruitAndVegetablesPrices =FruitAndVegetablesPrices(apples1kg=4.27f, banana1kg=0.76f, oranges1kg=3.18f, tomato1kg=1.42f, potato1kg=1.02f, onion1kg=0.74f, lettuceOneHead=0.83f),
                foodPrices =FoodPrices(loafOfFreshWhiteBread500g=0.64f, riceWhite1kg=0.66f, eggsRegular12=1.77f, localCheese1kg=7.4f, chickenFillets1kg=4.03f, beefRound1kgOrEquivalentBackLegRedMeat=5.89f),
                servicesPrices =ServicesPrices(basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment=23.56f, oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans=0.01f, internet60MbpsOrMoreUnlimitedDataCableAdsl=9.61f, fitnessClubMonthlyFeeForOneAdult=9.43f, tennisCourtRentOneHourOnWeekend=3.73f, cinemaInternationalReleaseOneSeat=2.37f, preschoolOrKindergartenFullDayPrivateMonthlyForOneChild=26.55f, internationalPrimarySchoolYearlyForOneChild=425.77f),
                clothesPrices =ClothesPrices(onePairOfJeansLevis50oneOrSimilar=20.59f, oneSummerDressInAChainStoreZaraHAndM=12.77f, onePairOfNikeRunningShoesMidRange=44.42f, onePairOfMenLeatherBusinessShoes=24.71f),
                transportationsPrices =TransportationsPrices(oneWayTicketLocalTransport=0.11f, monthlyPassRegularPrice=4.07f, taxiStartNormalTariff=0.27f, taxi1kmNormalTariff=0.27f, taxi1hourWaitingNormalTariff=0.49f, gasolineOneLiter=1.17f),
                carsPrices =CarsPrices(volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar=24406.97f, toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar=28672.95f),
                realEstatesPrices =RealEstatesPrices(apartmentOneBedroomInCityCentre=null, apartmentOneBedroomOutsideOfCentre=109.14f, apartment3BedroomsInCityCentre=549.78f, apartment3BedroomsOutsideOfCentre=221.96f, pricePerSquareMeterToBuyApartmentInCityCentre=1734.36f, pricePerSquareMeterToBuyApartmentOutsideOfCentre=430.56f),
                averageMonthlyNetSalaryAfterTax =null, dataQuality =true)
        )}


}