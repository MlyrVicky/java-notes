package com.day14;

public  sealed class Permits permits Chaild1 {


}

 sealed class Chaild1 extends Permits permits GrandChaild {

}
final class GrandChaild extends Chaild1{

}


