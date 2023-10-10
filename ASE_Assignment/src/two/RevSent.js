function reverseWords(sentence) {
    return sentence.split(" ").map(reverseWord).join(" ");
}

function reverseWord(word) {
    return word.split("").reverse().join("");
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);

console.log("Original Sentence:", inputSentence);
console.log("Reversed Sentence:", reversedSentence);
