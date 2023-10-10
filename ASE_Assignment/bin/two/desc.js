const numbers = [5, 2, 8, 1, 7];

// Sorting the array in descending order
const sortedDescending = numbers.sort(function(a, b) {
  return b - a;
});

console.log("Sorted Array (Descending):", sortedDescending);
