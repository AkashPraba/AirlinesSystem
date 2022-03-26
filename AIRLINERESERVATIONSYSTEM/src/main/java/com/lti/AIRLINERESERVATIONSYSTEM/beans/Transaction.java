package com.lti.AIRLINERESERVATIONSYSTEM.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "transactions")
public class Transaction {

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Tr_Id")
	private int TrId;
	/*
						 * * @Column(name="Pass_Id") private String passangerId;
						 * 
						 * @Column(name="Flight_Number") private String FlightNo;
						 */
	@Column(name = "Booking_Date")
	private String BookingDate;

	/*
	 * * @Column(name="city_id") private int cityId;
	 * 
	 * @Column(name="Seat_Number") private String SeatNo;
	 */

	@Column(name = "total_fair")
	private int Tfair;

	@Column(name = " P_Status")
	private String PStatus;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" }) //
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "Flight_Number")
	private Flight flightNo;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "Pass_Id")
	private Passengers passangerId;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "Seat_Number")
	private Seat seatNo;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "city_id")
	private City cityId;

	public Transaction() {
		super();
	}

	
	  public Transaction(int trId, String bookingDate, int tfair, String pStatus,
	  Flight flightNo, Passengers passangerId, Seat seatNo, City cityId)
	  { 
		  super();
		  
			TrId = trId;
			BookingDate = bookingDate;
			Tfair = tfair;
			PStatus = pStatus;
			this.flightNo = flightNo;
			this.passangerId = passangerId;
			this.seatNo = seatNo;
			this.cityId = cityId;
		}
	  
		public int getTrId() {
			return TrId;
		}

		public void setTrId(int trId) {
			TrId = trId;
		}

		public String getBookingDate() {
			return BookingDate;
		}

		public void setBookingDate(String bookingDate) {
			BookingDate = bookingDate;
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

		public Flight getFlightNo() {
			return flightNo;
		}

		public void setFlightNo(Flight flightNo) {
			this.flightNo = flightNo;
		}

		public Passengers getPassangerId() {
			return passangerId;
		}

		public void setPassangerId(Passengers passangerId) {
			this.passangerId = passangerId;
		}

		public Seat getSeatNo() {
			return seatNo;
		}

		public void setSeatNo(Seat seatNo) {
			this.seatNo = seatNo;
		}

		public City getCityId() {
			return cityId;
		}

		public void setCityId(City cityId) {
			this.cityId = cityId;
		}

		@Override
		public String toString() {
			return "Transaction [TrId=" + TrId + ", BookingDate=" + BookingDate + ", Tfair=" + Tfair + ", PStatus="
					+ PStatus + ", FlightNo=" + flightNo + ", passangerId=" + passangerId + ", SeatNo=" + seatNo
					+ ", cityId=" + cityId + "]";
		}	 

}