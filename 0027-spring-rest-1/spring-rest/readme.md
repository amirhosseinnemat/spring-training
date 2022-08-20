### README :

#### use `@Postconstruct` to load data only once.

### controller code for exception handling
+ also i  create custom exception and response error
```java
 // define endpoint for /students/{studentId} - return student by id with index.
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // check studentId against list size
        if ((studentId) >= students.size() || (studentId < 0)) {
            throw new StudentNotFoundException("student id not found -- " + studentId);
        }

        return students.get(studentId);

    }

    // add an exception handler with @ExceptionHandler

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {

        // create a StudentErrorResponse
        StudentErrorResponse errorResponse = new StudentErrorResponse();

        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(exc.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());

        // return response entity

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

```
### add exception handler for generic exception : 