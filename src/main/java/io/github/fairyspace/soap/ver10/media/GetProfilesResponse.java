package io.github.fairyspace.soap.ver10.media;

import io.github.fairyspace.soap.ver10.schema.Profile;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: onvif-easy
 * 🍁 Description:
 * 🍁 @author: xuquanru
 * 🍁 Create: 2023/2/1
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/


/*
* <?xml version="1.0" encoding="UTF-8"?>
<env:Envelope
    xmlns:env="http://www.w3.org/2003/05/soap-envelope"
    xmlns:soapenc="http://www.w3.org/2003/05/soap-encoding"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:tt="http://www.onvif.org/ver10/schema"
    xmlns:tds="http://www.onvif.org/ver10/device/wsdl"
    xmlns:trt="http://www.onvif.org/ver10/media/wsdl"
    xmlns:timg="http://www.onvif.org/ver20/imaging/wsdl"
    xmlns:tev="http://www.onvif.org/ver10/events/wsdl"
    xmlns:tptz="http://www.onvif.org/ver20/ptz/wsdl"
    xmlns:tan="http://www.onvif.org/ver20/analytics/wsdl"
    xmlns:tst="http://www.onvif.org/ver10/storage/wsdl"
    xmlns:ter="http://www.onvif.org/ver10/error"
    xmlns:dn="http://www.onvif.org/ver10/network/wsdl"
    xmlns:tns1="http://www.onvif.org/ver10/topics"
    xmlns:tmd="http://www.onvif.org/ver10/deviceIO/wsdl"
    xmlns:wsdl="http://schemas.xmlsoap.org/wsdl"
    xmlns:wsoap12="http://schemas.xmlsoap.org/wsdl/soap12"
    xmlns:http="http://schemas.xmlsoap.org/wsdl/http"
    xmlns:d="http://schemas.xmlsoap.org/ws/2005/04/discovery"
    xmlns:wsadis="http://schemas.xmlsoap.org/ws/2004/08/addressing"
    xmlns:xop="http://www.w3.org/2004/08/xop/include"
    xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2"
    xmlns:wsa="http://www.w3.org/2005/08/addressing"
    xmlns:wstop="http://docs.oasis-open.org/wsn/t-1"
    xmlns:wsrf-bf="http://docs.oasis-open.org/wsrf/bf-2"
    xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2"
    xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2"
    xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl"
    xmlns:wsrf-r="http://docs.oasis-open.org/wsrf/r-2"
    xmlns:tnshik="http://www.hikvision.com/2011/event/topics">
    <env:Body>
        <trt:GetProfilesResponse>
            <trt:Profiles token="Profile_1" fixed="true">
                <tt:Name>mainStream</tt:Name>

                <tt:VideoSourceConfiguration token="VideoSourceToken">
                    <tt:Name>VideoSourceConfig</tt:Name>
                    <tt:UseCount>2</tt:UseCount>
                    <tt:SourceToken>VideoSource_1</tt:SourceToken>
                    <tt:Bounds x="0" y="0" width="1600" height="1200"></tt:Bounds>
                </tt:VideoSourceConfiguration>

                <tt:VideoEncoderConfiguration token="VideoEncoderToken_1">
                    <tt:Name>VideoEncoder_1</tt:Name>
                    <tt:UseCount>1</tt:UseCount>
                    <tt:Encoding>H264</tt:Encoding>
                    <tt:Resolution>
                        <tt:Width>1600</tt:Width>
                        <tt:Height>1200</tt:Height>
                    </tt:Resolution>
                    <tt:Quality>5.000000</tt:Quality>
                    <tt:RateControl>
                        <tt:FrameRateLimit>25</tt:FrameRateLimit>
                        <tt:EncodingInterval>1</tt:EncodingInterval>
                        <tt:BitrateLimit>4096</tt:BitrateLimit>
                    </tt:RateControl>
                    <tt:H264>
                        <tt:GovLength>25</tt:GovLength>
                        <tt:H264Profile>Baseline</tt:H264Profile>
                    </tt:H264>
                    <tt:Multicast>
                        <tt:Address>
                            <tt:Type>IPv4</tt:Type>
                            <tt:IPv4Address>224.1.2.3</tt:IPv4Address>
                        </tt:Address>
                        <tt:Port>0</tt:Port>
                        <tt:TTL>1</tt:TTL>
                        <tt:AutoStart>false</tt:AutoStart>
                    </tt:Multicast>
                    <tt:SessionTimeout>PT5S</tt:SessionTimeout>
                </tt:VideoEncoderConfiguration>

                <tt:MetadataConfiguration token="MetaDataToken">
                    <tt:Name>metaData</tt:Name>
                    <tt:UseCount>2</tt:UseCount>
                    <tt:Analytics>false</tt:Analytics>
                    <tt:Multicast>
                        <tt:Address>
                            <tt:Type>IPv4</tt:Type>
                            <tt:IPv4Address>224.1.2.3</tt:IPv4Address>
                        </tt:Address>
                        <tt:Port>0</tt:Port>
                        <tt:TTL>1</tt:TTL>
                        <tt:AutoStart>false</tt:AutoStart>
                    </tt:Multicast>
                    <tt:SessionTimeout>PT0S</tt:SessionTimeout>
                </tt:MetadataConfiguration>


            </trt:Profiles>
            <trt:Profiles token="Profile_2" fixed="true">
                <tt:Name>subStream</tt:Name>
                <tt:VideoSourceConfiguration token="VideoSourceToken">
                    <tt:Name>VideoSourceConfig</tt:Name>
                    <tt:UseCount>2</tt:UseCount>
                    <tt:SourceToken>VideoSource_1</tt:SourceToken>
                    <tt:Bounds x="0" y="0" width="1600" height="1200"></tt:Bounds>
                </tt:VideoSourceConfiguration>
                <tt:VideoEncoderConfiguration token="VideoEncoderToken_2">
                    <tt:Name>VideoEncoder_2</tt:Name>
                    <tt:UseCount>1</tt:UseCount>
                    <tt:Encoding>H264</tt:Encoding>
                    <tt:Resolution>
                        <tt:Width>720</tt:Width>
                        <tt:Height>576</tt:Height>
                    </tt:Resolution>
                    <tt:Quality>4.000000</tt:Quality>
                    <tt:RateControl>
                        <tt:FrameRateLimit>25</tt:FrameRateLimit>
                        <tt:EncodingInterval>1</tt:EncodingInterval>
                        <tt:BitrateLimit>512</tt:BitrateLimit>
                    </tt:RateControl>
                    <tt:H264>
                        <tt:GovLength>50</tt:GovLength>
                        <tt:H264Profile>Baseline</tt:H264Profile>
                    </tt:H264>
                    <tt:Multicast>
                        <tt:Address>
                            <tt:Type>IPv4</tt:Type>
                            <tt:IPv4Address>224.1.2.3</tt:IPv4Address>
                        </tt:Address>
                        <tt:Port>0</tt:Port>
                        <tt:TTL>1</tt:TTL>
                        <tt:AutoStart>false</tt:AutoStart>
                    </tt:Multicast>
                    <tt:SessionTimeout>PT5S</tt:SessionTimeout>
                </tt:VideoEncoderConfiguration>
                <tt:MetadataConfiguration token="MetaDataToken">
                    <tt:Name>metaData</tt:Name>
                    <tt:UseCount>2</tt:UseCount>
                    <tt:Analytics>false</tt:Analytics>
                    <tt:Multicast>
                        <tt:Address>
                            <tt:Type>IPv4</tt:Type>
                            <tt:IPv4Address>224.1.2.3</tt:IPv4Address>
                        </tt:Address>
                        <tt:Port>0</tt:Port>
                        <tt:TTL>1</tt:TTL>
                        <tt:AutoStart>false</tt:AutoStart>
                    </tt:Multicast>
                    <tt:SessionTimeout>PT0S</tt:SessionTimeout>
                </tt:MetadataConfiguration>
            </trt:Profiles>
        </trt:GetProfilesResponse>
    </env:Body>
</env:Envelope>*/



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "profiles" })
@XmlRootElement(name = "GetProfilesResponse")
public class GetProfilesResponse {

    @XmlElement(name = "Profiles")
    protected List<Profile> profiles;
    public List<Profile> getProfiles() {
        if (profiles == null) {
            profiles = new ArrayList<Profile>();
        }
        return this.profiles;
    }

}
