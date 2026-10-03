class InvalidAgeException extends Exception{
//constructor we are declaring
    InvalidAgeException(String message){
        super(message);   //this line sends the message into parent class which is
                                //defined already in another file
    }
}