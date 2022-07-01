
# HsmForDetailsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Id del dispositivo di firma |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Tipo di dispositivo di firma |  [optional]
**local** | **Boolean** | Indica se il dispositivo di firma è locale o di rete |  [optional]
**state** | [**StateEnum**](#StateEnum) | Id del dispositivo di firma |  [optional]
**features** | [**HsmFeaturesDTO**](HsmFeaturesDTO.md) | Feature del dispositivo di firma |  [optional]
**keys** | [**List&lt;HsmKeyDTO&gt;**](HsmKeyDTO.md) | Elenco delle chiavi con dettagli disponibili nel dispositivo di firma |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
USB_TOKEN | &quot;USB_TOKEN&quot;
SMARTCARD | &quot;SMARTCARD&quot;
NETWORK_HSM | &quot;NETWORK_HSM&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
IN | &quot;LOGGED_IN&quot;
OUT | &quot;LOGGED_OUT&quot;



