
# HsmKeyDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **String** | Alias delle chiavi del dispositivo utilizzabili per la firma |  [optional]
**algorithm** | **String** | Algoritmo utilizzato dalla chiave |  [optional]
**format** | **String** | Formato di codifica primaria della chiave |  [optional]
**authenticationType** | [**AuthenticationTypeEnum**](#AuthenticationTypeEnum) | Indica le modalità di autenticazione per la chiave |  [optional]
**signerId** | **String** | Identificativo del firmatario |  [optional]


<a name="AuthenticationTypeEnum"></a>
## Enum: AuthenticationTypeEnum
Name | Value
---- | -----
LOCAL | &quot;LOCAL&quot;
PIN | &quot;PIN&quot;
PASSWORD | &quot;PASSWORD&quot;
USERNAME_AND_PASSWORD | &quot;USERNAME_AND_PASSWORD&quot;



