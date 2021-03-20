function linearSearch(arr, value) {
  if (!Array.isArray(arr))
    throw new Error("Expected 'arr' to be an array but found: " + typeof arr);

  for (let i = 0; i < arr.length; i++) if (arr[i] === value) return i;

  return -1;
}

var a = linearSearch([0, 2, 5, 7, 8, 18, 6], 7);
var b = linearSearch([0, 9, 5, 8], 8);
var c = linearSearch([0, 9, 3], 8);

console.log(" a ==> ", a);
console.log(" b ==> ", b);
console.log(" c ==> ", c);
