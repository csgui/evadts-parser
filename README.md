## EVA-DTS

EVA-DTS is the European Vending Association Data Transfer Standard.

The aim of the EVA-DTS is to provide a standard format for data which is required by operators of vending machines. The standard defines the structure of common data elements and describes the means of the transfer of the data.

EVA-DTS makes it possible to transfer information from vending machines/payment systems to PC-based accounting/management systems and/or the opposite way.

For more information check the European Vending Association [website](http://www.vending-europe.eu/standards/EVA-DTS.html).

### Parser

This tool will output an EVA-DTS file to a human readable form.

Group parsing supported in this version.

* DXS
* ST
* ID
* VA
* CB

This is a **WIP** project.

### EVA-DTS snippet

```
DXS*DJD0000000*VA*V0/6*1
ST*001*0001
ID1*DJD00001*9CND01221a1a*220*DJD**Siro 835a
ID5*051008*1154
VA1*0*0*0*0
VA2*0*0*0*0
VA3*29660*3717*0*0
PA1*7*10*Chocolate
PA2*0*0*0*0
PA4*122*1220*0*0
EA3*27
G85*1234
SE*12*0001
DXE*1*1
```

### Usage

```% java -jar <path-to-clojure-jar>/clojure.jar src/parser/core.clj <path-to-evadts-file>```
