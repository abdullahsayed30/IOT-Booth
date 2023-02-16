//package org.ieee.iot.service;
//
//import lombok.RequiredArgsConstructor;
//import org.ieee.iot.db.sequence.SequenceGenerator;
//import org.ieee.iot.domain.Device;
//import org.ieee.iot.repository.DeviceRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class DeviceServiceImpl implements DeviceService {
//
//    private final DeviceRepository deviceRepository;
//    private final SequenceGenerator sequenceGenerator;
//
//    @Override
//    public List<Device> getAllDevices() {
//        return deviceRepository.findAll();
//    }
//
//    @Override
//    public Device getDeviceByName(String deviceName) {
//        return deviceRepository.findByName(deviceName)
//                .orElseThrow(() -> new RuntimeException("Device not found"));
//    }
//
//    @Override
//    public Device createDevice(String deviceName, String deviceDescription) {
//
//        // Temp solution
//        if(deviceRepository.existsByName(deviceName))
//            throw new RuntimeException("Device already exists");
//
//        Long id = sequenceGenerator.generateSequence(Device.SEQ_NAME);
//        Device device = new Device(id, deviceName, deviceDescription, false);
//
//        return deviceRepository.save(device);
//    }
//
//    @Override
//    public void updateDeviceStateByName(String deviceName, boolean state) {
//        Device device = deviceRepository.findByName(deviceName)
//                .orElseThrow(() -> new RuntimeException("Device not found"));
//
//        device.setState(state);
//
//        deviceRepository.save(device);
//    }
//}
