package interactor

import model.CityEntity

class GetCitiesHasLowestFruitVegPricesComparingSalariesPaid
{
    private var dataSource: CostOfLivingDataSource? = null
    private var cityEntitylist: List<CityEntity> = listOf()

    constructor(dataSource: CostOfLivingDataSource){
        this.dataSource = dataSource
    }
    constructor(cityEntitylist: List<CityEntity>){
        this.cityEntitylist = cityEntitylist
    }

    fun execute(): List<CityEntity> {


        return cityEntitylist
    }



}