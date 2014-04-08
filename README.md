dcm4che-3.x Universal Software extended DICOM toolkit
=========================
Sources: https://github.com/universalsoftware/dcm4che-unvsoft  
Binaries: not available  
Issue Tracker: not available  

This is a fork from [dcm4che-3.x](https://github.com/dcm4che/dcm4che) project.

One main focus was to reuse the major functionality adding some specific features and leaving the initial code almost untouched.

Build
-----
After installation of [Maven 3](http://maven.apache.org):

    > mvn install

Modules
-------
- dcm4che-audit
- dcm4che-conf
  - dcm4che-conf-api
  - dcm4che-conf-api-hl7
  - dcm4che-conf-ldap
  - dcm4che-conf-ldap-audit
  - dcm4che-conf-ldap-hl7
  - dcm4che-conf-ldap-imageio
  - dcm4che-conf-prefs
  - dcm4che-conf-prefs-audit
  - dcm4che-conf-prefs-hl7
  - dcm4che-conf-prefs-imageio
- dcm4che-core
- dcm4che-emf
- dcm4che-hl7
- dcm4che-image
- dcm4che-imageio
- dcm4che-imageio-rle
- dcm4che-net
- dcm4che-net-audit
- dcm4che-net-hl7
- dcm4che-net-imageio
- dcm4che-soundex
- dcm4che-jboss-modules
- dcm4che-servlet
- dcm4che-unvsoft

Utilities
---------
- [dcm2dcm][]: Transcode DICOM file according the specified Transfer Syntax
- [dcm2jpg][]: Convert DICOM image to JPEG or other image formats
- [dcm2xml][]: Convert DICOM file in XML presentation
- [dcmdir][]: Dump, create or update DICOMDIR file
- [dcmdump][]: Dump DICOM file in textual form
- [dcmqrscp][]: Simple DICOM archive
- [dcmvalidate][]: Validate DICOM object according a specified Information Object Definition
- [emf2sf][]: Convert DICOM Enhanced Multi-frame image to legacy DICOM Single-frame images
- [findscu][]: Invoke DICOM C-FIND Query Request
- [getscu][]: Invoke DICOM C-GET Retrieve Request
- [hl72xml][]: Convert HL7 v2.x message in XML presentation
- [hl7pix][]: Query HL7 v2.x PIX Manager
- [hl7rcv][]: HL7 v2.x Receiver
- [hl7snd][]: Send HL7 v2.x message
- [ianscp][]: DICOM Instance Availability Notification receiver 
- [ianscu][]: Send DICOM Instance Availability Notification
- [mkkos][]: Make DICOM Key Object Selection Document
- [modality][]: Simulates DICOM Modality
- [movescu][]: Invoke DICOM C-MOVE Retrieve request
- [mppsscp][]: DICOM Modality Performed Procedure Step Receiver
- [mppsscu][]: Send DICOM Modality Performed Procedure Step
- [stgcmtscu][]: Invoke DICOM Storage Commitment Request
- [storescp][]: DICOM Composite Object Receiver
- [storescu][]: Send DICOM Composite Objects
- [xml2dcm][]: Create/Update DICOM file from/with XML presentation
- [xml2hl7][]: Create HL7 v2.x message from XML presentation
- [xml2prefs][]: Import Java Preferences

[dcm2dcm]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-dcm2dcm/README.md
[dcm2jpg]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-dcm2jpg/README.md
[dcm2xml]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-dcm2xml/README.md
[dcmdir]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-dcmdir/README.md
[dcmdump]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-dcmdump/README.md
[dcmqrscp]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-dcmqrscp/README.md
[dcmvalidate]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-dcmvalidate/README.md
[emf2sf]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-emf2sf/README.md
[findscu]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-findscu/README.md
[getscu]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-getscu/README.md
[hl72xml]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-hl72xml/README.md
[hl7pix]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-hl7pix/README.md
[hl7rcv]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-hl7rcv/README.md
[hl7snd]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-hl7snd/README.md
[ianscp]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-ianscp/README.md
[ianscu]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-ianscu/README.md
[mkkos]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-mkkos/README.md
[modality]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-ihe/dcm4che-tool-ihe-modality/README.md
[movescu]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-movescu/README.md
[mppsscp]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-mppsscp/README.md
[mppsscu]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-mppsscu/README.md
[stgcmtscu]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-stgcmtscu/README.md
[storescp]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-storescp/README.md
[storescu]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-storescu/README.md
[xml2dcm]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-xml2dcm/README.md
[xml2hl7]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-xml2hl7/README.md
[xml2prefs]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-tool/dcm4che-tool-xml2prefs/README.md

Universal Software extensions
---------
- [unvscp][]: Universal Software DICOM image archive
- [emsowauth][]: EMSOW authentication utility

[unvscp]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-unvsoft/dcm4che-tool/dcm4che-tool-unvscp/README.md
[emsowauth]: https://github.com/dcm4che/dcm4che/blob/master/dcm4che-unvsoft/emsowauth/README.md

License
-------
* [Mozilla Public License Version 1.1](http://www.mozilla.org/MPL/1.1/)

