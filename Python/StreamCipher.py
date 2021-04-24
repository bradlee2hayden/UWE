import random

randomPseudoGen = 69
charCount = 4
# set message to encode
message1 = "How are you today? I had a very busy day! I travelled 400 miles returning to London. It was windy and rainy. The traffic was bad too. I managed to finish my job, ref No 3789. But I am really tired. If possible, can we cancel tonight’s meeting?"
# set hidden message
message2 = "meet@9"


def encodeString(string1, string2):
    random.seed(randomPseudoGen)
    # create encoded message using random int of acsii numbers over lenght of string2 param input
    hideMessage = ([ord(x) ^ random.randint(0, 255) for x in string2])

    tempEncodeString = string1
    while len(string1) <= charCount * len(string2):
        string1 += tempEncodeString

    spliceEncodingMessage = []
    j = 0
    for i in range(0, len(string1), charCount):
        spliceEncodingMessage.append(string1[i:i + charCount])
        if ((i / charCount) < len(hideMessage)):
            spliceEncodingMessage.append("[" + str(hideMessage[j]) + "]")

            j += 1
    return ("".join(spliceEncodingMessage))


def decodeString(string1):
    tempEncodeString = string1.split("[")
    secretMessage = []
    for x in tempEncodeString:
        loopFilledString = ""
        for y in x:
            if (y == "]"):
                secretMessage.append(int(loopFilledString))
                break
            else:
                loopFilledString += y

    tempEncodeString = string1.split("]")
    beforeASCII = []
    for x in tempEncodeString:
        loopFilledString = ""
        for y in x:
            if (y == "["):
                beforeASCII.append((loopFilledString))
                break
            else:
                loopFilledString += y
    beforeASCII.append((loopFilledString))
    random.seed(randomPseudoGen)

    return "".join([chr(x ^ random.randint(0, 255)) for x in secretMessage]), "".join(beforeASCII)

# setup prints
encodedMessage = encodeString(message1, message2)
secretMessage, beforeXOR = decodeString(encodedMessage)
print("encoded Message " + encodedMessage)
print("original Message " + beforeXOR)
print("secret message " + secretMessage)
