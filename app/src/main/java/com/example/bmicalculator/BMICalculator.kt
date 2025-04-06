package com.example.bmicalculator

fun main(){

    println("Enter your weight in kg:")
    val weight = readLine()?.toFloatOrNull()?:0.0f

    println("Enter your height in metres")
    val height = readLine()?.toFloatOrNull()?:1.0f//to avoid division by zero

    if(height<=0 || weight<=0){
         println("Invalid input,Please enter positive values")
        return
    }

    val bmi = weight/(height * height)// BMI Calculation formula

    println("\nYour BMI is: %.2f".format(bmi))  // Format to 2 decimal places format to 2 decimal places

         //Classify BMI
    val category = when{
             bmi< 18.5 -> "Underweight"
             bmi in 18.5..24.9 ->"Normal weight"
             bmi in 25.0 ..29.9 ->"Overweight"
             else->"Obese"
    }
    println("BMI Category :$category")



}