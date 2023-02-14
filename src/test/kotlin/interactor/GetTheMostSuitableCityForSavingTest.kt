package interactor

import dataSource.FakeCsvDataSource
import dataSource.utils.CsvParser
import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTheMostSuitableCityForSavingTest {
    lateinit var csvParser : CsvParser
    lateinit var dataSource: CostOfLivingDataSource
    lateinit var city: GetTheMostSuitableCityForSaving

    @BeforeAll
    fun setup(){
        csvParser= CsvParser()
        dataSource  = FakeCsvDataSource(csvParser)
        city = GetTheMostSuitableCityForSaving(dataSource)
    }

    @Test
    fun should_ReturnTheCorrectCityEntity_when_execute(){
        //given

        //when
        val expected = CityEntity(cityName="Sri Jayewardenepura Kotte", country="Sri Lanka", mealsPrices= MealsPrices(mealInexpensiveRestaurant=1.08f, mealFor2PeopleMidRangeRestaurant=6.78f, mealAtMcDonaldSOrEquivalent=4.34f), drinksPrices= DrinksPrices(cappuccinoRegularInRestaurants=0.99f, cokePepsiAThirdOfLiterBottleInRestaurants=0.27f, waterAThirdOfLiterBottleInRestaurants=0.21f, milkRegularOneLiter=0.91f, waterOneAndHalfLiterBottleAtTheMarket=0.34f), fruitAndVegetablesPrices= FruitAndVegetablesPrices(apples1kg=1.8f, banana1kg=0.6f, oranges1kg=1.75f, tomato1kg=0.63f, potato1kg=0.81f, onion1kg=0.66f, lettuceOneHead=0.68f), foodPrices= FoodPrices(loafOfFreshWhiteBread500g=0.41f, riceWhite1kg=0.56f, eggsRegular12=1.15f, localCheese1kg=6.07f, chickenFillets1kg=2.54f, beefRound1kgOrEquivalentBackLegRedMeat=4.72f), servicesPrices=ServicesPrices(basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment=40.68f, oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans=0.01f, internet60MbpsOrMoreUnlimitedDataCableAdsl=16.27f, fitnessClubMonthlyFeeForOneAdult=8.59f, tennisCourtRentOneHourOnWeekend=2.71f, cinemaInternationalReleaseOneSeat=2.44f, preschoolOrKindergartenFullDayPrivateMonthlyForOneChild=14.92f, internationalPrimarySchoolYearlyForOneChild=903.96f), clothesPrices=ClothesPrices(onePairOfJeansLevis50oneOrSimilar=26.1f, oneSummerDressInAChainStoreZaraHAndM=8.59f, onePairOfNikeRunningShoesMidRange=48.81f, onePairOfMenLeatherBusinessShoes=62.37f), transportationsPrices=TransportationsPrices(oneWayTicketLocalTransport=0.08f, monthlyPassRegularPrice=2.44f, taxiStartNormalTariff=0.27f, taxi1kmNormalTariff=0.2f, taxi1hourWaitingNormalTariff=0.46f, gasolineOneLiter=0.78f), carsPrices=CarsPrices(volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar=36610.46f, toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar=26847.67f), realEstatesPrices=RealEstatesPrices(apartmentOneBedroomInCityCentre=77.97f, apartmentOneBedroomOutsideOfCentre=33.45f, apartment3BedroomsInCityCentre=267.8f, apartment3BedroomsOutsideOfCentre=89.49f, pricePerSquareMeterToBuyApartmentInCityCentre=null, pricePerSquareMeterToBuyApartmentOutsideOfCentre=null), averageMonthlyNetSalaryAfterTax=81.36f, dataQuality=false)
        val result = city.execute()
        //then
        assertEquals(expected , result)
    }
}