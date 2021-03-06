/*
 * ******************************************************************************
 *  * OpenFlightGPS is Copyright 2009-2015 by Roger B. Leuthner
 *  *
 *  * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  * GNU General Public License for more details.
 *  *
 *  * Commercial Distribution License
 *  * If you would like to distribute OpenFlightGPS (or portions thereof) under a license other than
 *  * the "GNU General Public License, version 2", contact Roger B. Leuthner through GitHub.
 *  *
 *  * GNU Public License, version 2
 *  * All distribution of OpenFlightGPS must conform to the terms of the GNU Public License, version 2.
 *  *****************************************************************************
 */

package com.cso.and.of.ui.map.products;

import android.os.Bundle;

import com.cso.and.of.ui.map.MapActivity;


public class Sectional extends MapActivity {
	
	public Sectional() {
		super();
		
	}
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate( savedInstanceState );
        mapView.getOverlays().add( createScaleBarOverlay() );
        addMyLocationOverlay();     
//        mapView.getOverlays().add( createDirectedLocationOverlay() );
        addWaypointOverlay();
	}
	
	@Override
	public int getMaxZoom() {
		return 10;
	}

	@Override
	public int getMinZoom() {
		return 6;
	}

	@Override
	public int getDefaultLocatedZoom() {
		return getMinZoom() + ( ( getMaxZoom() - getMinZoom() ) / 2 ) + 1;
	}
}
