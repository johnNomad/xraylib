/*Copyright (c) 2010, Tom Schoonjans
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
    * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
    * The names of the contributors may not be used to endorse or promote products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY Tom Schoonjans ''AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL Tom Schoonjans BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/


public class xrlexample7 {
	public static void main(String argv[]) {
		//Xraylib.SetErrorMessages(0);
//		Xraylib.SetHardExit(1);
		System.out.println("Example of java program using Xraylib");
		System.out.println("Atomic weight of Fe: "+Xraylib.AtomicWeight(26)+" g/mol");
		System.out.println("Density of pure Al: "+Xraylib.ElementDensity(13)+" g/cm3");
		System.out.println("Photoionization cs of Fe at 10.0 keV: "+Xraylib.CS_Photo(26, 10.0)+" cm2/g");
		System.out.println("Rayleigh scattering cs of Fe at 10.0 keV: "+Xraylib.CS_Rayl(26, 10.0)+" cm2/g");
		System.out.println("Compton scattering cs of Fe at 10.0 keV: "+Xraylib.CS_Compt(26, 10.0)+" cm2/g");
		System.out.println("Total cs of Fe at 10.0 keV: "+Xraylib.CS_Total(26, 10.0)+" cm2/g");
		System.out.println("Total cs (Kissel) of Fe at 10.0 keV: "+Xraylib.CS_Total_Kissel(26, 10.0)+" cm2/g");
		System.out.println("Al mass energy-absorption cs at 20.0 keV: "+ Xraylib.CS_Energy(13, 20.0));
		System.out.println("K atomic level width for Fe: "+Xraylib.AtomicLevelWidth(26,Xraylib.K_SHELL) + " keV");
		System.out.println("K fluorescence yield for Fe: "+Xraylib.FluorYield(26,Xraylib.K_SHELL));
		System.out.println("K jumpfactor for Fe: "+Xraylib.JumpFactor(26,Xraylib.K_SHELL));
		System.out.println("M1->M5 Coster-Kronig transition probability for Au : "+Xraylib.CosKronTransProb(79,Xraylib.FM15_TRANS));
		System.out.println("L1->L3 Coster-Kronig transition probability for Fe : "+Xraylib.CosKronTransProb(26,Xraylib.FL13_TRANS));
		System.out.println("Bi M1N2 radiative rate: "+Xraylib.RadRate(83,Xraylib.M1N2_LINE));
		System.out.println("Zr L1 edge energy: " + Xraylib.EdgeEnergy(40, Xraylib.L1_SHELL) + " keV");
		System.out.println("Fe atomic form factor: " + Xraylib.FF_Rayl(26, 1.0));
		System.out.println("Ni scattering form factor: " + Xraylib.SF_Compt(28, 1.0));
		System.out.println("Differential Thomson cross section at 45 deg: " + Xraylib.DCS_Thoms(45.0*Math.PI/180.0) + " cm2/g");
		System.out.println("Differential Klein-Nishina cross section at 10 keV and 45 deg: " + Xraylib.DCS_KN(10.0, 45.0*Math.PI/180.0) + " cm2/g");
		System.out.println("Differential Rayleigh cross section for Zn at 10 keV and 45 deg: " + Xraylib.DCS_Rayl(30, 10.0, 45.0*Math.PI/180.0) + " cm2/g");
		System.out.println("Differential Compton cross section for Zn at 10 keV and 45 deg: " + Xraylib.DCS_Compt(30, 10.0, 45.0*Math.PI/180.0) + " cm2/g");
		System.out.println("Moment transfer function at 10 keV and 45 deg: " + Xraylib.MomentTransf(10.0, 45.0*Math.PI/180.0));
		System.out.println("Klein-Nishina cross section at 10 keV: " + Xraylib.CS_KN(10.0) + " cm2/g");
		System.out.println("Photon energy after Compton scattering at 10 keV and 45 deg angle: " + Xraylib.ComptonEnergy(10.0, 45.0*Math.PI/180.0));
		System.out.println("Photoionization cs of Fe (Kissel) at 10.0 keV: "+Xraylib.CS_Photo_Total(26, 10.0)+" cm2/g");
  		System.out.println("Fe partial photoionization cs of L3 at 6.0 keV: "+Xraylib.CS_Photo_Partial(26,Xraylib.L3_SHELL, 6.0));
		System.out.println("ElectronConfig (Kissel) of Fe L3-shell: " + Xraylib.ElectronConfig(26, Xraylib.L3_SHELL));
		System.out.println("ElectronConfig (Biggs) of Fe L3-shell: " + Xraylib.ElectronConfig_Biggs(26, Xraylib.L3_SHELL));
		System.out.println("Compton profile for Fe at pz = 1.1: "+Xraylib.ComptonProfile(26,(float) 1.1));
		System.out.println("M5 Partial Compton profile for Fe at pz = 1.1: "+Xraylib.ComptonProfile_Partial(26,Xraylib.M5_SHELL, 1.1));
		System.out.println("Bi L2-M5M5 Auger non-radiative rate: "+Xraylib.AugerRate(86,Xraylib.L2_M5M5_AUGER));
		System.out.println("Bi L3 Auger yield: "+Xraylib.AugerYield(86, Xraylib.L3_SHELL));
		System.out.println("Ca K-alpha Fluorescence Line Energy: "+Xraylib.LineEnergy(20,Xraylib.KA_LINE));
		System.out.println("U M3O3 Fluorescence Line Energy: "+Xraylib.LineEnergy(92,Xraylib.M3O3_LINE));
                System.out.println("Pb Lalpha XRF production cs at 20.0 keV (jump approx): "+Xraylib.CS_FluorLine(82, Xraylib.LA_LINE, 20.0));
		System.out.println("Pb Lalpha XRF production cs at 20.0 keV (Kissel): "+Xraylib.CS_FluorLine_Kissel(82, Xraylib.LA_LINE, 20.0));
		System.out.println("Au Ma1 XRF production cs at 10.0 keV (Kissel): "+Xraylib.CS_FluorLine_Kissel(79,Xraylib.MA1_LINE,(float) 10.0));
		System.out.println("Au Mb XRF production cs at 10.0 keV (Kissel): "+Xraylib.CS_FluorLine_Kissel(79,Xraylib.MB_LINE,(float) 10.0));
		System.out.println("Au Mg XRF production cs at 10.0 keV (Kissel): "+Xraylib.CS_FluorLine_Kissel(79,Xraylib.MG_LINE,(float) 10.0));
		System.out.println("Pb Malpha XRF production cs at 20.0 keV with cascade effect: "+Xraylib.CS_FluorLine_Kissel(82,Xraylib.MA1_LINE,(float) 20.0));
		System.out.println("Pb Malpha XRF production cs at 20.0 keV with radiative cascade effect: "+Xraylib.CS_FluorLine_Kissel_Radiative_Cascade(82,Xraylib.MA1_LINE,(float) 20.0));
	System.out.println("Pb Malpha XRF production cs at 20.0 keV with non-radiative cascade effect: "+Xraylib.CS_FluorLine_Kissel_Nonradiative_Cascade(82,Xraylib.MA1_LINE,(float) 20.0));
		System.out.println("Pb Malpha XRF production cs at 20.0 keV without cascade effect: "+Xraylib.CS_FluorLine_Kissel_no_Cascade(82,Xraylib.MA1_LINE,(float) 20.0));
		System.out.println("Sr anomalous scattering factor Fi at 10.0 keV: " + Xraylib.Fi(38, 10.0));
		System.out.println("Sr anomalous scattering factor Fii at 10.0 keV: " + Xraylib.Fii(38, 10.0));
		System.out.println("Symbol of element 26 is: " + Xraylib.AtomicNumberToSymbol(26));
		System.out.println("Number of element Fe is: " + Xraylib.SymbolToAtomicNumber("Fe"));
		System.out.println(Xraylib.CompoundParser("Ca(HCO3)2"));
		System.out.println(Xraylib.CompoundParser("SiO2"));
		System.out.println(Xraylib.CompoundParser("Ca5(PO4)OH"));
		System.out.println(Xraylib.CompoundParser("Fe0.6Mn0.4SiO3"));
		/*
		System.out.println("Ca(HCO3)2 Rayleigh cs at 10.0 keV: "+Xraylib.CS_Rayl_CP("Ca(HCO3)2",(float) 10.0) );
		System.out.println("CS2 Refractive Index at 10.0 keV : "+Xraylib.Refractive_Index_Re("CS2",(float) 10.0,(float) 1.261)+" - "+Xraylib.Refractive_Index_Im("CS2",(float) 10.0,(float) 1.261)+" i");
		System.out.println("C16H14O3 Refractive Index at 1 keV : "+Xraylib.Refractive_Index_Re("C16H14O3",(float) 1.0,(float) 1.2)+" - "+Xraylib.Refractive_Index_Im("C16H14O3",(float) 1.0,(float) 1.2)+" i");
		System.out.println("SiO2 Refractive Index at 5.0 keV : "+Xraylib.Refractive_Index_Re("SiO2",(float) 5.0,(float) 2.65)+" - "+Xraylib.Refractive_Index_Im("SiO2",(float) 5.0,(float) 2.65)+" i");
		System.out.println("Al mass energy-absorption cs at 20.0 keV: "+ Xraylib.CS_Energy(13, (float) 20.0));
		System.out.println("Pb mass energy-absorption cs at 40.0 keV: "+ Xraylib.CS_Energy(82, (float) 40.0));
		System.out.println("CdTe mass energy-absorption cs at 40.0 keV: "+ Xraylib.CS_Energy_CP("CdTe", (float) 40.0));
		*/
		System.out.println("");
		System.out.println("--------------------------- END OF XRLEXAMPLE7 -------------------------------");
		System.out.println("");
		System.exit(0);
	}
}
