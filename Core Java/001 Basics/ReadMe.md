There are two data types available in Java:
1. [Primitive Data Types](#primitive-data-types)
2. [Reference/Object Data Types](#reference/object-data-types)


# Primitive Data Types #

## Integral Data Types ##
|  | Size | Range| Range Formula |
| --- | --- | ---| --- |
| byte | 8 bit | -128 to +127 | -2n-1 to 2n-1 -1 |
| short | 2 byte = 16 bit | -32768 to +32767 | -2n-1 to 2n-1 -1 |
| int | 4 byte = 32 bit | - 2,147,483,648 to +2,147,483,647 | -2n-1 to 2n-1 -1 |
| long | 8 byte = 64 bit | -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807 | -2n-1 to 2n-1 -1 |

NOTE:
- byte, int, long, and short can be expressed in decimal(base 10), hexadecimal(base 16) or octal(base 8) number systems as well.
- Prefix 0 is used to indicate octal, and prefix 0x indicates hexadecimal when using these number systems for literals

``` java
int decimal = 100;
int octal = 0144;
int hexa =  0x64;
```

## Floating data types ##
|  | Size | Range|
| --- | --- | ---|
| float | 4 byte = 32 bit| 3 .4e–038 to 3.4e+038 |
| double | 8 byte = 16 bit | 1 .7e–308 to 1.7e+308 |


### Float ###
Float data type is a single-precision 32-bit IEEE 754 floating point
- has a precision of 7 digits.
NOTE: float data type is never used for precise values such as currency

### Double ###
double data type is a double-precision 64-bit IEEE 754 floating point
NOTE: Double data type should never be used for precise values such as currency


## boolean ##
- boolean data type represents one bit of information
- Default value is false

## char ##
- char data type is a single 16-bit Unicode character
- Minimum value is '\u0000' (or 0)
- Maximum value is '\uffff' (or 65,535 inclusive)


# Reference/Object Data Types #
- Reference variables are created using defined constructors of the classes. They are used to access objects. These variables are declared to be of a specific type that cannot be changed. For example, Employee, Puppy, etc.

- Class objects and various type of array variables come under reference datatype.

- Default value of any reference variable is null.
