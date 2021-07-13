fun main() {
    println("${love(4,4)}")
    println("${love(3,11)}")
    println("${love(22,17)}")


}


    fun love(flowerOne : Int, flowerTwo : Int): Boolean{
        return if (flowerOne % 2 == 0 && flowerTwo % 2 != 0) {
            true;
        }else flowerOne % 2 != 0 && flowerTwo % 2 == 0;
    }




