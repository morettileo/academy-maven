
# PrinterDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Id stampante | 
**printerType** | [**PrinterTypeEnum**](#PrinterTypeEnum) | Tipo stampante | 
**local** | **Boolean** | Indica se il dispositivo di stampa è locale o di rete | 
**printerState** | [**PrinterStateEnum**](#PrinterStateEnum) | Stato della stampante |  [optional]
**paperSizes** | **List&lt;String&gt;** | Elenco dei formati pagina associati alla stampante |  [optional]
**paperSources** | **List&lt;String&gt;** | Elenco delle sorgenti carta/cassetti alla stampante |  [optional]
**duplexSupported** | **Boolean** | Indica se la stampante supporta il fronte/retro |  [optional]
**_default** | **Boolean** | Indica se la stampante è quella di default |  [optional]


<a name="PrinterTypeEnum"></a>
## Enum: PrinterTypeEnum
Name | Value
---- | -----
GENERAL_PURPOSE | &quot;GENERAL_PURPOSE&quot;
ZEBRA | &quot;ZEBRA&quot;


<a name="PrinterStateEnum"></a>
## Enum: PrinterStateEnum
Name | Value
---- | -----
IDLE | &quot;IDLE&quot;
BUSY | &quot;BUSY&quot;
OFFLINE | &quot;OFFLINE&quot;
OUT_OF_PAPER | &quot;OUT_OF_PAPER&quot;
FAULT | &quot;FAULT&quot;



