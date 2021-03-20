function binarySearch(arr, value) {
  if (!Array.isArray(arr))
    throw new Error("Expected 'arr' to be an array but found: " + typeof arr);

  arr = arr.sort((a, b) => a - b);

  // console.log("Array in sorted form ==> ", arr);

  let low = 1;
  let high = arr.length;
  let mid = 0;

  while (arr[mid] !== value) {
    if (high < low) return -1;

    mid = Math.floor(low + (high - low) / 2);

    if (arr[mid] < value) low = mid + 1;
    if (arr[mid] > value) high = mid - 1;
    if (arr[mid] === value) return mid;
  }

  return mid;
}

var a = binarySearch([0, 9, 10, 20, 25], 10);
var b = binarySearch([1, 8, 15, 23, 24, 110, 112], 24);
var c = binarySearch([9, 5, 7, 3, 1, 2], 8);

console.log(" a ==> ", a);
console.log(" b ==> ", b);
console.log(" c ==> ", c);
