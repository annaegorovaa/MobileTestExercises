1. When using xpath and classname you don't need full package name, 
so we can write one line of code instead of two.

2. You have to change a device name capability in driver setup file.

3. In order to run test on real device you need to connect it to your computer
(by USB cable or Wi-Fi). Unfortunately Android driver can't unlock real device 
if it's protected by PIN-code or fingerprint, so this option should be turned
off.
Element has no id on real device, xpath and className work fine.

4. Name of the test should have sense and tell what feature is tested.
Capabilities should be moved to property file.
We need to assert that after clicking on button something changed (application 
reacted on clicking).