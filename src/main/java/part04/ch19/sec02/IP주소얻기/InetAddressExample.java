package part04.ch19.sec02.IP주소얻기;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			// 로컬 컴퓨터의 InetAddress 객체를 얻는다.
			InetAddress local = InetAddress.getLocalHost();

			// 로컬 컴퓨터의 IP 주소 조회
			System.out.println("로컬 PC의 IP 주소 : " + local.getHostAddress());
			System.out.println();

			// 도메인명이 'www.naver.com'로 등록된 모든 InetAddress 객체를 얻는다.
			InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");

			// 도메인명이 'www.naver.com'로 등록된 모든 IP 주소 조회
			for(InetAddress inetAddress : inetAddresses){
				System.out.println("www.naver.com 도메인에 등록된 IP 주소 : " + inetAddress.getHostAddress());
			}
		} catch (UnknownHostException e){
			e.printStackTrace();
		}
	}
}
