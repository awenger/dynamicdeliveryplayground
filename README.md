# dynamicdeliveryplayground
Dynamic Delivery Playground

### Demonstrates problem with Dynamic Delivery Modules and BroadcastReceivers
- [BroadcastReceiver](https://github.com/awenger/dynamicdeliveryplayground/blob/3cc9d164c3151bd1a87d119c994360cae9f245e3/app/src/main/AndroidManifest.xml#L20)
of the core module work as expected (intent is delivered exactly once)
- [BroadcastReceiver](https://github.com/awenger/dynamicdeliveryplayground/blob/master/dynamicfeature/src/main/AndroidManifest.xml#L19)
of the dynamic feature module receive Intents twice.

This is independent of were the Intent is broadcasted
[core](https://github.com/awenger/dynamicdeliveryplayground/blob/3cc9d164c3151bd1a87d119c994360cae9f245e3/app/src/main/java/com/github/awenger/dynamicdeliveryplayground/MainActivity.kt#L22-L32)
and
[dynamic module](https://github.com/awenger/dynamicdeliveryplayground/blob/3cc9d164c3151bd1a87d119c994360cae9f245e3/dynamicfeature/src/main/java/com/github/awenger/dynamicfeature/DynamicFeatureActivity.kt#L15-L25)

The behavior changes if the Receiver from the dynamic feature module is overwritten in the base AndroidManifest to be no longer enabled, [see](https://github.com/awenger/dynamicdeliveryplayground/blob/3cc9d164c3151bd1a87d119c994360cae9f245e3/app/src/main/AndroidManifest.xml#L26)