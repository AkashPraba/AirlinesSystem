package com.lti.AIRLINERESERVATIONSYSTEM.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "transactions2")
public class Transaction2 {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tran_seq")
	@SequenceGenerator(name="tran_seq",sequenceName="tran_seq",allocationSize=1 )
	@Column(name = "Tr_Id")
	private int TrId;
	@Column(name = "Pass_Id")
	private String passangerId;

	@Column(name = "Flight_Number")
	private String FlightNo;

	@Column(name = "Booking_Date")
	private String BookingDate;

	@Column(name = "city_id")
	private int cityId;

	@Column(name = "Seat_Number")
	private String SeatNo;

	@Column(name = "total_fair")
	private int Tfair;

	@Column(name = " P_Status")
	private String PStatus;

	public Transaction2() {
		super();
	}

	
	public Transaction2(int trId, String passangerId, String flightNo, String bookingDate, int cityId, String seatNo,
			int tfair, String pStatus) {
		super();
		TrId = trId;
		this.passangerId = passangerId;
		FlightNo = flightNo;
		BookingDate = bookingDate;
		this.cityId = cityId;
		SeatNo = seatNo;
		Tfair = tfair;
		PStatus = pStatus;
	}


	public int getTrId() {
		return TrId;
	}

	public void setTrId(int trId) {
		TrId = trId;
	}

	public String getPassangerId() {
		return passangerId;
	}

	public void setPassangerId(String passangerId) {
		this.passangerId = passangerId;
	}

	public String getFlightNo() {
		return FlightNo;
	}

	public void setFlightNo(String flightNo) {
		FlightNo = flightNo;
	}

	public String getBookingDate() {
		return BookingDate;
	}

	public void setBookingDate(String bookingDate) {
		BookingDate = bookingDate;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getSeatNo() {
		return SeatNo;
	}

	public void setSeatNo(String seatNo) {
		SeatNo = seatNo;
	}

	public int getTfair() {
		return Tfair;
	}

	public void setTfair(int tfair) {
		Tfair = tfair;
	}

	public String getPStatus() {
		return PStatus;
	}

	public void setPStatus(String pStatus) {
		PStatus = pStatus;
	}


	@Override
	public String toString() {
		return "Transaction2 [TrId=" + TrId + ", passangerId=" + passangerId + ", FlightNo=" + FlightNo
				+ ", BookingDate=" + BookingDate + ", cityId=" + cityId + ", SeatNo=" + SeatNo + ", Tfair=" + Tfair
				+ ", PStatus=" + PStatus + "]";
	}
	
}