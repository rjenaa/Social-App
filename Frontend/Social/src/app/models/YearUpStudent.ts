import { Experience } from './Experience';
import { Education } from './Education';
import { Picture } from './Picture';
import { Resume } from './Resume';
export class YearUpStudent{
    id: number;
    accountId: number;
    firstName: string;
    lastName: string;
    nickName: string;
    email: string;
    phoneNumber: string;
    bio: string;
    skill: string;
    expeience: Experience[];
    education: Education[];
    picture: Picture;
    resume: Resume;
}