# Basic #

## Integral Data Types ##
|  | Size | Range| Range Formula |
| --- | --- | ---| --- |
| byte | 8 bit | -128 to +127 | -2n-1 to 2n-1 -1 |
| short | 2 byte = 16 bit | -32768 to +32767 | -2n-1 to 2n-1 -1 |
| int | 4 byte = 32 bit | - 2,147,483,648 to +2,147,483,647 | -2n-1 to 2n-1 -1 |
| long | 8 byte = 64 bit | -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807 | -2n-1 to 2n-1 -1 |

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

