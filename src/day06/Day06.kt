package day06

import println
import readInput

fun part1(input: List<String>): Int {
    return input.size
}

fun part2(input: List<String>): Int {
    return input.size
}

fun main() {
    // Read a test input from the `src/day06/Day06_test.txt` file:
    val testInput = readInput("day06/Day06_test")
    check(part1(testInput) == testInput.size)
    check(part2(testInput) == testInput.size)

    // Read the input from the `src/day06/Day06.txt` file:
    val input = readInput("day06/Day06")
    part1(input).println()
    part2(input).println()
}