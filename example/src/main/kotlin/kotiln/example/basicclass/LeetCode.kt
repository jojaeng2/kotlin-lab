package kotiln.example.basicclass

class Solution {
    fun wateringPlants(plants: IntArray, capacity: Int): Int {
        var answer : Int = 0
        var current : Int = 0
        for (i in plants.indices) {
            if (isPossible(plants[i], capacity)) {
                answer++
                current -= plants[i]
            }
            else {
                answer += 2*i
                current -= plants[i]
            }
        }
        return answer
    }

    fun isPossible(a : Int, b : Int) = (a <= b)

}